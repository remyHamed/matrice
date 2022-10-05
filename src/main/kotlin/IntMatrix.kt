class IntMatrix (row: Int, col :Int ) : Matrice <Int>(row, col) {
   /* operator fun times(other: IntMatrix): IntMatrix {
        if(this.col != other.line)
            throw Exception("matrices are not multipliable")
        val result =
        for (i in 0 until line) {

            for (j in 0 until col) {
                grid[i][j]

            }
        }
        return this;
    }*/

}

open class BooleanMatrix(row: Int, col :Int) : Matrice <Boolean>(row, col) {

}