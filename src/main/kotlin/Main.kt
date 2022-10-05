fun main(args: Array<String>) {
    val m = SquareMatrix<Int>(5)
    print(m.toString())
    m[0,1] = 5
    print(m)
    val im = IntMatrix(6,4)
    val im2 = IntMatrix(4,6)
    val d = MinesweperBoard(10, 10)
    val res = d.getBoardHints()
    print(res)

}