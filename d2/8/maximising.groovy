int highest = 0

boolean finished = false

while (!finished) {
  println "Enter a number, or type -1 to finish:"
  String str = System.console().readLine()
  int i = Integer.parseInt(str)
  if (i == -1) {
    finished = true
    println "The highest number you entered is " + highest
    break;
  } else if (i > highest) {
    highest = i
  }
}