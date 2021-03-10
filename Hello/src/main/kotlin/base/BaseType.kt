package base

/**
 * 基础变量
 *  @author jion
 */
class BaseType {

    // 基本数据类型,仅有包装类型,没有基本类型
    fun baseType() {
        // 只读变量, 不能被直接修改
        val a: String = "Hello"
        // 可变变量, 可以被重复赋值
        var b: String = "name"

        // 类型推导, 根据类型自动推断...
        var aa = 123
        var bb = "name"

        // 类型转换
        var c: Int = 10
        var cc: Long = 10.toLong()

        // 无符号类型,兼容 C 语言
        var d1: UByte = 1u
        var d2: UShort = 1u
        var d3: UInt = 1000u
        var d4: ULong =10000000u

        // 数据类型
        var e1 = 1
        var e2 = 1L
        var e3 = 1.0
        var e4 = 1.0F
    }

    // 字符数据类型
    fun stringType(){
        val a = "Hello 世界"
        // 字符串模板
        println("输出>> $a")
        println("长度>> ${a.length}")

        val b = "Hello 世界"
        // 比较 内容 及 地址引用
        println(a == b)
        println(a === b)

        // 字符段
        val c = """
            你好,这是一串字符...
        """.trimIndent()
    }
}