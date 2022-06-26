package top.jionjion.kotlin.web.bean

import java.time.LocalDate

/**
 *  @author Jion
 */
class User {

    var id: Int = 0
    var username: String = ""
    var password: String = ""
    var address: String = ""
    var birthday: LocalDate = LocalDate.now()

    /** 无参数构造函数 */
    constructor()

    /**
     *  有参构造函数
     */
    constructor(id: Int, username: String, password: String, address: String, birthday: LocalDate) {
        this.id = id
        this.username = username
        this.password = password
        this.address = address
        this.birthday = birthday
    }

    // 重写方法
    override fun toString(): String {
        return "User(id=$id, username='$username', password=$password, address=$address, birthday=$birthday)"
    }
}