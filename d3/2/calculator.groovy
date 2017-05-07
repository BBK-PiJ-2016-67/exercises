print("Enter a number: ")
String str = System.console().readLine()
double a = Double.parseDouble(str)
print("Enter a number: ")
str = System.console().readLine()
double b = Double.parseDouble(str)

println("Select an operation:")
println("- Type 1 for addition")
println("- Type 2 for subtraction")
println("- Type 3 for multiplication")
println("- Type 4 for division")

str = System.console().readLine()

print("The answer is: ")

switch(str) {
  case "1":
    println(a + b)
    break
  case "2":
    println(a - b)
    break
  case "3":
    println(a * b)
    break
  case "4":
    println(a / b)
    break
  default:
    println("Invalid operation")
    break
}