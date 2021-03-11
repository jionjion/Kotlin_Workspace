package clazz

// 定义接口
interface Animal

// 定义实现
class Dog : Animal {
    fun say() {
        println("汪汪汪...")
    }
}

/**
 *  类型转换
 */
fun main() {
    // 用父类的引用指向子类
    val animal: Animal = Dog()
    // 判断当前对象是否为该类的实现
    if (animal is Dog) {
        // 类型转换, 与方法调用
        (animal as Dog).say()
    }
    // 安全转换, 当为空时,不执行
    (animal as? Dog)?.say()

    // 空类型转换
    val s: String = "124"
    // 判断是否为 null, 此时为 String 类型
    if (s != null) {
        // 不为空, 此时转为 String? 类型
        println(s.length)
    }
    // 结束后, 转为 String 类型
}
