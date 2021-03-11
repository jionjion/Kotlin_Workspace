package clazz

/**
 *  空类型安全.
 */
class NullType {

    // 不为空类型, 在初始化阶段进行复赋值
    var name: String = "Jion"

    // 可为空类型, ? 表示可为空
    var adder: String? = "Jion"

    // 类型强制转换.. 当 adder 可以为空, 且判断不为空时, 可以直接调用 !!. 执行构造函数
    var len: Int = adder!!.length

    // 类型转换, 当adder为空时, len2 赋值空
    var len2: Int? = adder?.length

    // 类型转换, 当adder为空时, len2 赋值 0
    var len3: Int? = adder?.length ?: 0
}