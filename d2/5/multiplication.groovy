println("Enter a number:")
String str = System.console().readLine()
int a = Integer.parseInt(str)

println("Enter another number:")
str = System.console().readLine()
int b = Integer.parseInt(str)

int c = 0

for (i = 0; i < b; i++) {
	c += a
}

println(a + " multiplied by " + b + " is " + c)
