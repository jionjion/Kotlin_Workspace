package func

/**
 *  函数
 */

// 主函数, 分别声明 函数名, 参数类别, 返回值空类型 Unit 等价 void
fun main(args: Array<String>): Unit {
    // 变长参数
    println(args.contentToString())
}


// 函数,无参数无返回值 () -> Unit
fun fun2() {

}

// 函数引用
val f2: () -> Unit = ::fun2
val f22 = ::fun2

// 函数,有参数有返回值 (Int) -> String
fun fun3(arg: Int): String {
    return ""
}

// 函数的引用
val f3: (Int) -> String = ::fun3
val f33 = ::f3

/** 含有函数的类 */
class FunType() {
    // 类中函数,有参数有返回值   FunType(Int, String) -> Any  或者  (FunType, Int, String) -> Any
    fun fun4(arg1: Int, arg2: String): Any {
        return 1;
    }
}

// 函数的引用
val f4: (FunType, Int, String) -> Any = FunType::fun4
val f44 = FunType::fun4


// 变长参数,参数长度不确定
fun fun5(vararg args: String): Unit {
    // 变长参数
    println(args.contentToString())
}

// 多返回值, 返回个数为确定的多个
fun fun6(): Triple<Int, Long, Double> {
    return Triple(1, 2L, 3.0)
}

// 默认参数
fun fun7(arg1: Int, arg2: Int = 0) {

}

// 调用函数,使用具名参数
fun main() {
    // 变长参数
    fun5("A", "B")
    // 解构调用多返回值参数
    var (i, l, d) = fun6()
    // 默认值参数
    fun7(1)
    // 具名参数调用
    fun7(arg1 = 1)
}
