public class Matrix {
  private int[][] array;

  public Matrix(int x, int y) {
    this.array = new int[y][x];

    for (int i = 0; i < this.array.length; i++) {
      for (int j = 0; j < this.array[i].length; j++) {
        this.array[i][j] = 1;
      }
    }
  }

  private boolean hasX(int x) {
    return x < this.array[0].length;
  }

  private boolean hasY(int y) {
    return y < this.array.length;
  }

  public void setElement(int x, int y, int z) {
    if (!this.hasY(y) || !this.hasX(x)) {
      return;
    }    

    this.array[y][x] = z;
  }

  public void setRow(int y, String row) {
    if (!this.hasY(y)) {
      return;
    }

    String[] array = row.split(",");
    
    if (array.length != this.array[0].length) {
      return;
    }

    for (int i = 0; i < array.length; i++) {
      this.array[y][i] = Integer.parseInt(array[i]);
    }
  }

  public void setColumn(int x, String row) {
    if (!this.hasX(x)) {
      return;
    }

    String[] array = row.split(",");
    
    if (array.length != this.array.length) {
      return;
    }

    for (int i = 0; i < array.length; i++) {
      this.array[i][x] = Integer.parseInt(array[i]);
    }
  }

  public String toString() {
    String str = "[";

    for (int i = 0; i < this.array.length; i++) {
      for (int j = 0; j < this.array[i].length; j++) {
        str = str + Integer.toString(this.array[i][j]);

        str = str + (j == (this.array[i].length - 1) ? "" : ",");
      }
      str = str + (i == (this.array.length - 1) ? "]" : ";");
    }

    return str;
  }

  public void prettyPrint() {
    for (int i = 0; i < this.array.length; i++) {
      for (int j = 0; j < this.array[i].length; j++) {
        System.out.print(this.array[i][j] + "\t");
      }
      System.out.println("");
    }
  }
}