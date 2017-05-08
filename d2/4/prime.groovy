println("Enter a number:")

String str = System.console().readLine()
int input = Integer.parseInt(str)

boolean isPrime = true

for (i = 2; i < input / 2; i++) {
	if (input % i == 0) {
		isPrime = false
		break
	}
}

println(input + (isPrime ? " is" : " is not") + " a prime number")
