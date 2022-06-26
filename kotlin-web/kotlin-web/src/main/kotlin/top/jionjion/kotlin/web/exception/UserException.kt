package top.jionjion.kotlin.web.exception

/**
 * @author Jion
 * 自定义用户异常
 */
class UserException(val code: Int, message: String?) : RuntimeException(message) {

    /* 静态 */
    companion object {
        /** 内部版本代码  */
        private const val serialVersionUID = 2L
    }
}