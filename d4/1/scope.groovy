class UnitMatrix {
  int size;

  void setSize(int newSize) {
    this.size = newSize;
  }

  void print() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i == j) {
          println("1 ");
        } else {
          println("0 ");
        }
      }
      println ""
    }
  }
}

// i is visible on lines 10 through 17 inclusive
// j is visible on lines 11 through 15 inclusive
// newSize is visible on line 5
// size is visible on lines 2 through 19 inclusive