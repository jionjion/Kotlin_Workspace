package demo

/**
 *  区间
 */
class RangeType {

    fun rangeType() {
        // [1, 10] 离散集合
        val intRange = 1..10
        // [1, 10] 连续集合
        val floatRange = 1F..10F
        // [a .. z] 字符
        val charRange = 'a' .. 'z'

        // [1, 10) 左闭右开
        val longRange = 1 until 10L

        // ^[10, 1] 从达到小降序
        val intRange2 = 10 downTo 1

        // [1, 3, 6, 9] 设置步长
        var intRange3 = 1 .. 10 step 3


        // 打印离散
        print(intRange.joinToString())
        // 打印连续
        println(floatRange.toString())
    }
}