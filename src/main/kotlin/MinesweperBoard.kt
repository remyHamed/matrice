class MinesweperBoard(row: Int, col:Int): BooleanMatrix(row,col) {

    init {
        for (i in 0 until line) {
            for (j in 0 until col) {
                val r = (0..10).random()
                this.grid[i][j] = r % 3 == 0
            }
        }
    }
    fun getBoardHints():IntMatrix {
        val m =  IntMatrix(this.line, this.col)
        for (i in 0 until line) {
            for (j in 0 until col) {
               if(this.grid[i][j] == false) {
                   m[i,j] = this.checkAround(i,j)
               }

            }
        }
        return m
    }

    fun checkAround(i:Int, j: Int):Int {
        var res = 0
        for(k in i - 1.. i + 1) {
            if(k < 0 || k >= line)
                continue
            for (m in j - 1 ..j + 1) {
                if(i == k && m == j)
                    continue

                if(m < 0 || m >= col)
                    continue

                if(this.grid[k][m] == true)
                    res++
            }
        }
        return res
    }
}