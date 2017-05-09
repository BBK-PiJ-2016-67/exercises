MatrixChecker matrixChecker = new MatrixChecker()

int[] array = [1, 2, 1]
println(matrixChecker.isSymmetrical(array)) // true
array = [1, 2, 3]
println(matrixChecker.isSymmetrical(array)) // false
array = [1]
println(matrixChecker.isSymmetrical(array)) // true
array = [1, 1]
println(matrixChecker.isSymmetrical(array)) // true
array = [1, 0]
println(matrixChecker.isSymmetrical(array)) // false

println("---")

int[][] matrix = [[1, 2, 3], [2, 2, 2], [3, 2, 1]]
println(matrixChecker.isSymmetrical(matrix)) // true
matrix = [[1, 2, 3]]
println(matrixChecker.isSymmetrical(matrix)) // false
matrix = [[1]]
println(matrixChecker.isSymmetrical(matrix)) // true
matrix = [[1, 1], [1, 1]]
println(matrixChecker.isSymmetrical(matrix)) // true
matrix = [[1, 0], [3]]
println(matrixChecker.isSymmetrical(matrix)) // false

println("---")

matrix = [[1, 0, 0], [2, 2, 0], [3, 2, 1]]
println(matrixChecker.isTriangular(matrix)) // true
matrix = [[1, 2, 3], [1, 2, 3], [1, 2, 3]]
println(matrixChecker.isTriangular(matrix)) // false
matrix = [[1]]
println(matrixChecker.isTriangular(matrix)) // true
matrix = [[1, 0], [1, 1]]
println(matrixChecker.isTriangular(matrix)) // true
matrix = [[1, 0], [3]]
println(matrixChecker.isTriangular(matrix)) // false
