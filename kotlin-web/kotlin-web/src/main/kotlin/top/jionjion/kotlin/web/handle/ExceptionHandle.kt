package top.jionjion.kotlin.web.handle

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import top.jionjion.kotlin.web.dto.ResultMessage
import top.jionjion.kotlin.web.exception.UserException

/**
 *
 * 全局异常通知
 * @author Jion
 */
@ControllerAdvice
class ExceptionHandle {
    /**
     * 处理异常的类,这里将异常统一捕获,完成分类处理
     */
    @ExceptionHandler(value = [Exception::class])
    @ResponseBody
    fun handle(exception: Exception): ResultMessage<*> {
        // 如果属于自定义的异常
        if (exception is UserException) {
            // 强制类型转换
            val e: UserException = exception

            // 将抛出的异常捕获后包装
            return ResultMessage<String>(500, e.message)
        }

        //如果不是自动返回系统的异常
        return ResultMessage<String>(550, exception.message)
    }
}
