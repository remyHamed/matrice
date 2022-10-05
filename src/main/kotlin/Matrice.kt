
abstract class Matrice <T>(line: Int, col: Int)  {
    protected val line: Int
    protected val col: Int
    protected val grid:List<MutableList<T?>>


    init {
        this.line = line
        this.col = col
        this.grid =  List(line){
            MutableList(col){
                null
            }
        }
    }

    override fun toString(): String {
        var printingMatrice = ""
        for (i in 0 .. line - 1) {
            printingMatrice = printingMatrice.plus("[")
            for (j in 0..col - 1) {
                if(grid[i][j] == null) {
                    printingMatrice = printingMatrice.plus("-")
                } else {
                    printingMatrice = printingMatrice.plus(grid[i][j])
                }
                if(j < col - 1) {
                    printingMatrice = printingMatrice.plus(",")
                }
            }
            printingMatrice = printingMatrice.plus("]\n")
        }

        return "Matrice(grid= \n${printingMatrice})"
    }

    operator fun set(i: Int, j: Int, value: T) {
        this.grid[i][j] = value
    }

    fun isSquare():Boolean {
        return this.col == this.line
    }
}