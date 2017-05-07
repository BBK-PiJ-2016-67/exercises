print("Enter some text: ")

class ArbitraryString {
  String value;
  def ArbitraryString(value) {
    this.value = value
  }
  def splitAndPrint(delimiter) {
    def list = this.value.split(delimiter)

    int i = 0

    while(i < list.size()) {
      println(list[i])
      i = i + 1
    }
  }
}

String str = System.console().readLine()

ArbitraryString arbitraryString1 = new ArbitraryString(str)

arbitraryString1.splitAndPrint("")

print("Enter a sentence: ")

str = System.console().readLine()

ArbitraryString arbitraryString2 = new ArbitraryString(str)

arbitraryString2.splitAndPrint(" ")

