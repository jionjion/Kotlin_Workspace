package clazz

/**
 *  类的类型
 */

// 默认 public
class ClassType {

    // 构造函数
    constructor(x: Int) {
        this.x = x
    }

    // 成员变量, 必须初始化
    var x: Int = 1

    // 成员函数
    fun sum() {

    }
}

// 类, 构造器
class ClassType2// 构造函数
    (// 成员变量, 必须初始化
    var x: Int
) {

}

//  类, 构造器, 并声明成员变量 x
class ClassType3(var x: Int) {

}


// 使用类
fun main() {
    val class1 = ClassType(1)
    println(class1.x)
    class1.sum()
}
