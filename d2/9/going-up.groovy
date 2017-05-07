boolean ascending = true
boolean finished = false
int previous = 0

while (!finished) {
  println "Enter a number, or type -1 to finish:"
  String str = System.console().readLine()
  int i = Integer.parseInt(str)
  if (i == -1) {
    println ascending ? "YES" : "NO"
    break;
  }
  ascending = ascending && (i > previous)
  previous = i
}