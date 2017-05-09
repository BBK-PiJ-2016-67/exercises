public class MatrixChecker {

  public boolean isSymmetrical(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      if (array[i] != array[array.length - 1 - i]) {
        return false;
      }
    }
    return true;
  }

  public boolean isSymmetrical(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i].length != matrix.length) {
        return false;
      }
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] != matrix[j][i]) {
          return false;
        }
      }
    }
    return true;
  }

  public boolean isTriangular(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i].length != matrix.length) {
        return false;
      }
      for (int j = 0; j < matrix[i].length; j++) {
        if (j > i && matrix[i][j] != 0) {
          return false;
        }
      }
    }
    return true;
  } 

}
