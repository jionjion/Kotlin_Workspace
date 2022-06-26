package top.jionjion.kotlin.web.service

import org.springframework.stereotype.Service
import top.jionjion.kotlin.web.bean.User
import java.time.LocalDate

/**
 *  @author Jion
 */
@Service
class UserService {

    /**
     * 模拟数据
     */
    private val usersList = ArrayList<User>()

    init {
        usersList.add(
            User(
                1, "Jion", "123456", "HeNan", LocalDate.of(2022, 1, 1)
            )
        )
        usersList.add(
            User(
                2, "Ber", "123456", "ShangHai", LocalDate.of(2022, 2, 11)
            )
        )
        usersList.add(
            User(
                3, "Cher", "123456", "BeiJin", LocalDate.of(2022, 3, 21)
            )
        )
    }

    /**
     * 查询全部
     */
    fun findAll(): List<User> {
        return usersList
    }

    /**
     * 保存一个
     */
    fun save(user: User): User {
        usersList.add(user)
        return user
    }

    /**
     * 查询一个
     */
    fun findOne(id: Int?): User? {
        for (user in usersList) {
            if (user.id == id) {
                return user
            }
        }
        return null
    }

    /**
     * 通过姓名查询
     */
    fun findByUsername(username: String?): List<User> {
        val list = ArrayList<User>()
        for (user in usersList) {
            if (user.username == username) {
                list.add(user)
            }
        }
        return list
    }

    /**
     * 删除一个
     */
    fun delete(id: Int?) {
        usersList.removeIf { user: User -> user.id == id }
    }
}
