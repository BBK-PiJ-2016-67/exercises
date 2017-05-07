ArrayCopier arrayCopier = new ArrayCopier()

int[] src = [1, 2, 3]
int[] dst = [4, 5, 6]

int[] result = arrayCopier.copy(src, dst)

println(result)

src = [1, 2, 3, 4, 5, 6]
dst = [7, 8, 9]

result = arrayCopier.copy(src, dst)

println(result)

src = [1, 2, 3]
dst = [4, 5, 6, 7, 8, 9]

result = arrayCopier.copy(src, dst)

println(result)