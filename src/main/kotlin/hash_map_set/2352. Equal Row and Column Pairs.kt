package hash_map_set

/**
Creator: Zohidjon Akbarov
 */
/**
 * Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.

A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
 */
fun main() {
    print(equalPairs(arrayOf(intArrayOf(1, 2, 3), intArrayOf(1, 2, 3), intArrayOf(2, 2, 2))))
}

private var count = 0
private fun equalPairs(grid: Array<IntArray>): Int {
    for (i in grid.indices) {
        for (j in grid.indices) {
            dfs(grid, i, 0, 0, j)
        }
    }
    return count
}

private fun dfs(grid: Array<IntArray>, r1: Int, c1: Int, r2: Int, c2: Int) {
    if (grid[r1][c1] != grid[r2][c2]) return
    if (c1 == grid.size - 1 && r2 == grid.size - 1) {
        count++
        return
    }
    dfs(grid, r1, c1 + 1, r2 + 1, c2)
}