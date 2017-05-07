println("Enter a calculation: ")

String str = System.console().readLine()

if (str.indexOf("+") > -1) {
  def values = str.split("\\+")
  double a = Double.parseDouble(values[0])
  double b = Double.parseDouble(values[1])  
  println(a + b)
} else if (str.indexOf("-") > -1) {
  def values = str.split("\\-")
  double a = Double.parseDouble(values[0])
  double b = Double.parseDouble(values[1])  
  println(a - b)
} else if (str.indexOf("*") > -1) {
  def values = str.split("\\*")
  double a = Double.parseDouble(values[0])
  double b = Double.parseDouble(values[1])  
  println(a * b)
} else if (str.indexOf("/") > -1) {
  def values = str.split("\\/")
  double a = Double.parseDouble(values[0])
  double b = Double.parseDouble(values[1])  
  println(a / b)
} else {
  println("Bad input.")
}