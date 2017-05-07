public class ArrayChecker {
  public boolean isSymmetrical(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] != array[array.length - (i + 1)]) {
        return false;
      }
    }

    return true;
  }
  public int[] reverse(int[] array) {
    int[] reversedArray = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      reversedArray[array.length - (i + 1)] = array[i];
    }

    return reversedArray;
  }
}