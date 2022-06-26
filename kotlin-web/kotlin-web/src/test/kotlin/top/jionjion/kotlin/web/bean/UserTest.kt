package top.jionjion.kotlin.web.bean

import org.junit.jupiter.api.Test
import java.time.LocalDate

/**
 * @author Jion
 */
internal class UserTest {

    @Test
    fun id() {
        val user = User(1, "Jion", "123456", "上海", LocalDate.now())

        // 调用属性方法
        println("User[id=" + user.id + "username=" + user.username + "password=" + user.password + "address=" + user.address + "birthday=" + user.birthday + "]")
        // 调用 toString()
        println(user.toString())
    }
}