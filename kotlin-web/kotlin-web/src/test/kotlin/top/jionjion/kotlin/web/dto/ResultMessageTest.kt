package top.jionjion.kotlin.web.dto

import org.junit.jupiter.api.Test

/**
 * 测试下返回消息
 * @author Jion
 */
internal class ResultMessageTest {

    @Test
    fun getMessage() {
        val result = ResultMessage<String>(500, "service error!")
        println(result.code)
        println(result.message)
        println(result.date)
    }

    @Test
    fun getDate() {
        val result = ResultMessage<String>()
        result.code = 200
        result.message = "成功"
        result.date = "这是内容..."
    }
}