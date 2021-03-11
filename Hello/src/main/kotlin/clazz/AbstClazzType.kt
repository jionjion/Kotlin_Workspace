package clazz

// 抽象类
abstract class abstractClazzType {

    // 抽象方法
    abstract fun sum();

    // open 修饰 protected 方法, 子类可以选择是否覆盖
    open fun dev() {
        println("默认方法")
    }

    // final 方法
    fun pev() {
        println("不可修改的方法")
    }
}


class ClazzType : abstractClazzType() {
    // override 修饰子类的覆盖方法
    override fun sum() {
        println("实现抽象方法")
    }
}