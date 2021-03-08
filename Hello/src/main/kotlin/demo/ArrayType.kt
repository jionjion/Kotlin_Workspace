package demo


/**
 *  数组类型
 */
class ArrayType {

    // 数组类型
    fun arrayType() {
        // 基本类型   基本类型装箱
        // IntArray; Array<Int>;
        // CharArray; Array<Char>;
        // Array<String>
        var a1 = intArrayOf(1, 2, 3, 4)
        var a2 = IntArray(3) { it + 1 }


        // 字符数组, arrayOf 构造数组
        val b1 = arrayOf("Hello", "World")
        b1[1] = "World!"
        println(b1[0])
        println(b1.size)
    }

    // 循环
    fun each(){
        val a1 = longArrayOf(1,2,3,4)
        a1.forEach { e -> { println(e)} }

        // 判断是否在内
        println(1 in a1)
        println(1 !in a1)
    }
}