println("Enter a number:")
String str = System.console().readLine()
int a = Integer.parseInt(str)

println("Enter another number:")
str = System.console().readLine()
int b = Integer.parseInt(str)

int c = 0
int remainder = a

while (remainder >= b) {
	remainder -= b
	c++;
}

println(a + " divided by " + b + " is " + c + ", remainder " + remainder)
