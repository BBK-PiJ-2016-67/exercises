print("Enter some text: ")

class ArbitraryString {
  String value;
  def ArbitraryString(value) {
    this.value = value
  }
  def countOccurencesOf(letter) {
    def list = this.value.split("")

    int count = 0

    int i = 0

    while(i < list.size()) {
      String charAtIndex = list[i]

      count = charAtIndex == letter ? count + 1 : count

      i = i + 1
    }

    return count
  }
}

String str = System.console().readLine()

ArbitraryString arbitraryString = new ArbitraryString(str)

int count = arbitraryString.countOccurencesOf("e")

print(count + " es")
