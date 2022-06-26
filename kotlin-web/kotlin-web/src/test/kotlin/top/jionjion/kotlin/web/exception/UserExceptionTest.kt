package top.jionjion.kotlin.web.exception

import org.junit.jupiter.api.Test

/**
 * @author Jion
 */
internal class UserExceptionTest {

    @Test
    fun id() {
        val ex = UserException(40001, "未找到用户")
        println(ex.code)
        println(ex.message)
        println(ex)
    }
}