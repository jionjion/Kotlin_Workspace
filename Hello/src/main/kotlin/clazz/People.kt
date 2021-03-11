package clazz

/**
 *  自定义类
 */
class People(age: Int, name: String) {

    // 成员变量
    var age:Int = age
        // 成员变量 age 的 get 方法
        get() {
            // 当前成员变量的值
            return field
        }
        // 成员变量 age 的 set 方法
        set(value) {
            // 传入的值, 赋值给当前变量
            field = value
        }

    // 成员变量, 默认生成 get / set 方法
    var name:String = name
}
// 扩展方法
fun People.sayHello(){
    println("Hello")
}


fun main() {
    val people = People(21, "Jion")
    // 获得属性引用,并调用设置属性值
    val property1 = People::age
    property1.set(people, 22)

    println(people.age)

    // 通过对象调用扩展方法
    people.sayHello()
    // 通过方法引用调用扩展方法
    people::sayHello.invoke()
}