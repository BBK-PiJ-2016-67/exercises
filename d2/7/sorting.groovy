// Write a program that reads three numbers and prints them in order,
// from lowest to highest

println("Enter a number:")
String str = System.console().readLine()
int a = Integer.parseInt(str)

println("Enter another number:")
str = System.console().readLine()
int b = Integer.parseInt(str)

println("Enter another number:")
str = System.console().readLine()
int c = Integer.parseInt(str)

int[] arr = [a, b, c]

boolean sorted = false

while (!sorted) {
	boolean sortedSoFar = true
	for (i = 0; i < arr.size() - 1; i++) {
		sortedSoFar = sortedSoFar && arr[i] < arr[i + 1]
		if (arr[i] > arr[i + 1]) {
			int x = arr[i]
			arr[i] = arr[i + 1]
			arr[i + 1] = x
		}
	}
	sorted = sortedSoFar
}

println(arr)
