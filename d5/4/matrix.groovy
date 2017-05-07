Matrix matrix = new Matrix(5, 5)

matrix.setElement(1, 4, 3)

matrix.setRow(2, "7,3,3,2,1")

matrix.setColumn(3, "1,2,3,4,5")

String str = matrix.toString()

println(str)

matrix.prettyPrint()