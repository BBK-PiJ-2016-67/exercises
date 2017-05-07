boolean ascending = true
boolean isValid = true
boolean finished = false
int previous = 0
int x = 0

while (!finished) {
  println "Enter a number, or type -1 to finish:"
  String str = System.console().readLine()
  int i = Integer.parseInt(str)
  if (i == -1) {
    println isValid ? "YES" : "NO"
    break;
  }
  if (x == 1) {
    ascending = i > previous
    isValid = i != previous
  }
  isValid = isValid && ((ascending && i > previous) || (!ascending && i < previous))
  previous = i
  x = x + 1
}