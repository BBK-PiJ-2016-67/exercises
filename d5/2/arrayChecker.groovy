ArrayChecker arrayChecker = new ArrayChecker()

int[] array = [1, 2, 3, 4, 5, 4, 3, 2, 3]

if (arrayChecker.isSymmetrical(array)) {
  println("This array is symmetrical")
} else {
  print(arrayChecker.reverse(array))
}