class ArbitraryString {
  String value;
  def ArbitraryString(value) {
    this.value = value
  }
  def countOccurencesOf(str) {
    def list = this.value.split("")

    int count = 0

    int i = 0

    def inputList = str.split("")

    while(i < list.size()) {
      int x = 0

      while(x < inputList.size()) {
        if (list[i + x] != inputList[x]) {
          break;
        }

        count = x == (inputList.size() - 1) ? count + 1 : count

        x = x + 1
      }

      i = i + 1
    }

    return count
  }
}

print("Enter some text: ")

String str = System.console().readLine()

ArbitraryString arbitraryString = new ArbitraryString(str)

print("Search for occurrences of: ")

str = System.console().readLine()

int count = arbitraryString.countOccurencesOf(str)

print("Found " + count + " occurences of " + str)
