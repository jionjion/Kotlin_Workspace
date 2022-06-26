package top.jionjion.kotlin.web.dto

/**
 * 消息返回包装类
 *  @author Jion
 */
class ResultMessage<T> {

    /** 代表消息状态  */
    var code: Int? = null

    /** 详细内容  */
    var message: String? = null

    /** 存放数据  */
    var date: T? = null

    /** 无参数构造函数 */
    constructor()

    /**
     *  有参构造函数
     */
    constructor(code: Int?, message: String?) {
        this.code = code
        this.message = message
    }

    /**
     *  有参构造函数
     */
    constructor(code: Int?, message: String?, date: T) {
        this.code = code
        this.message = message
        this.date = date
    }
}
