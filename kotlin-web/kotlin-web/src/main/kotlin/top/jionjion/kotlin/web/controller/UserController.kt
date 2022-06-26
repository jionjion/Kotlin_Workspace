package top.jionjion.kotlin.web.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.*
import top.jionjion.kotlin.web.bean.User
import top.jionjion.kotlin.web.dto.ResultMessage
import top.jionjion.kotlin.web.exception.UserException
import top.jionjion.kotlin.web.service.UserService

/**
 * @author Jion
 */
@RestController
@RequestMapping("/user")
class UserController @Autowired constructor(@Autowired val userService: UserService) {

    /**
     * 查询全部
     * URL: http://localhost:8080/MicroServices/user/users
     */
    @GetMapping(value = ["/users"])
    fun userList(): List<User> {
        return userService.findAll()
    }

    /**
     * 新增一个
     * URL: http://localhost:8080/MicroServices/user/user
     */
    @PostMapping(value = ["/user"])
    fun userSave(user: User, result: BindingResult): ResultMessage<User> {
        // @Valid表示进行对象参数验证	BindingResult:为参数的验证结果

        // 封装的结果对象
        if (result.hasErrors()) {
            //如果有错误,则返回bean中的定义
            val message = result.fieldError?.defaultMessage
            return ResultMessage(400, message)
        }
        //传入User对象,前台只需要传递对象的属性名即可
        user.username = user.username
        user.password = user.password
        val userReturn: User = userService.save(user)
        return ResultMessage(200, "成功", userReturn)
    }

    /**
     * 查询一个
     * URL: http://localhost:8080/MicroServices/user/users/1
     */
    @GetMapping(value = ["/users/{id}"])
    fun userGet(@PathVariable("id") id: Int?): User? {
        return userService.findOne(id)
    }

    /**
     * 更新一个
     * URL: http://localhost:8080/MicroServices/user/users/3
     */
    @PutMapping(value = ["/users/{id}"])
    fun userUpdate(@PathVariable("id") id: Int, @RequestParam("username") username: String, @RequestParam("password") password: String): User {
        val user = User()
        //保存主键
        user.id = id
        user.username = username
        user.password = password
        //当保存主键一致时,为更新操作
        return userService.save(user)
    }

    /**
     * 删除一个
     * URL: http://localhost:8080/MicroServices/user/users/3
     */
    @DeleteMapping(value = ["/users/{id}"])
    fun userDelete(@PathVariable("id") id: Int?) {
        userService.delete(id)
    }

    /**
     * 自定义查询,通过姓名查询用户
     * URL: http://localhost:8080/MicroServices/user/users/username/Jion
     */
    @GetMapping(value = ["/users/username/{username}"])
    fun userGetByUsername(@PathVariable("username") username: String?): List<User> {
        return userService.findByUsername(username)
    }

    /**
     * 统一异常捕获.
     * 将service层抛出的异常,dao层抛出的异常进行统一向外抛出,交由ExceptionHandle类进行包装向前台传递
     * 这里模拟包含的类进行的异常抛出
     * URL:http://localhost:8080/MicroServices/user/error/2			调用第二种异常,并返回
     */
    @GetMapping(value = ["/error/{code}"])
    fun errorCodeHandler(@PathVariable("code") code: String) {
        val error1 = "1"
        val error2 = "2"
        if (error1 == code) {
            //抛出自定义的异常,测试统一异常处理
            throw UserException(500, "这是一个错误...")
        }
        if (error2 == code) {
            throw UserException(500, "这是另一个错误...")
        }
        throw RuntimeException("其他错误...")
    }
}