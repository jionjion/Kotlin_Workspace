package demo

/**
 *  fun 函数声明
 *  main 主入口函数
 *  args 参数列表, 为String 类型
 */
fun main(args: Array<String>) {
    // 控制台打印
    println("Hello World!")

    // 构建对象
    val people = People("Jion")
    // 调用方法
    people.sayHello()
    // 获得属性
    println(people.name)

    // 安全地非空处理
    println(args.toString())
}