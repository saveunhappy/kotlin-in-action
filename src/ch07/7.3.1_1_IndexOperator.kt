package ch07.ex3_1_1_IndexOperator

data class Point(val x: Int, val y: Int)
//get方法可是可以重载的，这个，应该不太常用
operator fun Point.get(index: Int): Int {
    return when(index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}
data class Tile(val terrainType: String, val isWalkable: Boolean)

class GameMap(private val mapData: Array<Array<Tile>>) {
    operator fun get(x: Int, y: Int): Tile {
        return mapData[x][y]
    }
}
fun main(args: Array<String>) {
    val p = Point(10, 20)
    println(p[1])

    val mapData = arrayOf(
        arrayOf(Tile("grass", true), Tile("water", false)),
        arrayOf(Tile("sand", true), Tile("grass", true))
    )
    val gameMap = GameMap(mapData)
    //数组套数组，下标从0开始，这样就很实用了。
    val tile0 = gameMap[0, 0]
    val tile1 = gameMap[0, 1]
    val tile2 = gameMap[1, 0]
    val tile3 = gameMap[1, 1]

    println(tile0) // Output: Tile(terrainType=grass, isWalkable=true)
    println(tile1) // Output: Tile(terrainType=water, isWalkable=false)
    println(tile2) // Output: Tile(terrainType=sand, isWalkable=true)
    println(tile3) // Output: Tile(terrainType=grass, isWalkable=true)
}
