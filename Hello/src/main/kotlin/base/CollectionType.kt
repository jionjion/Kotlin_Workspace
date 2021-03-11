package base

/**
 *  集合框架
 */
class CollectionType {
    // 列表
    fun listType() {
        // 不可变长度的列表
        val list1: List<Int> = listOf(1, 2, 3)

        // 可变长度的里表
        val list2: MutableList<Int> = mutableListOf(1, 2, 3)
        // 读取
        val o = list2[2]
        // 修改
        list2[2] = 3

        // 添加元素
        list2.add(4)
        list2 += 5
        // 删除元素
        list2.remove(4)
        list2 -= 5
    }

    // 映射
    fun mapType() {
        // 不可变长度的映射
        val map1: Map<String, Any> = mapOf("name" to "Jion", "age" to 21)
        // 可变长度的映射
        val map2: MutableMap<String, Any> = mutableMapOf("name" to "Jion", "age" to 21)
        // 读取
        val o = map2["name"]
        // 修改
        map2["name"] = "Jion"
    }

    // 集合
    fun setType() {
        // 不可变长度的映射, Any 等价 Object
        val map1: Map<String, Any> = mapOf("name" to "Jion", "age" to 21)
        // 可变长度的映射
        val map2: MutableMap<String, Any> = mutableMapOf("name" to "Jion", "age" to 21)
    }

    // 键值对
    fun pairType() {
        // 声明
        val pair1 = "name" to "Jion"
        val pair2 = Pair("age", 21)
        // 分别获取键值对
        val first = pair1.first
        val second = pair1.second
        // 解构表达式
        val (x, y) = pair2
    }


    // 三元素
    fun tripleType() {
        // 声明
        val triple = Triple("name","Jion", "Jion")
        // 分别获取
        val first = triple.first
        val second = triple.second
        val third = triple.third
        // 解构表达式
        val (x, y, z) = triple
    }
}