public class ArrayCopier {
  public int[] copy (int[] src, int[] dst) {
    for (int i = 0; i < dst.length; i++) {
      dst[i] = i > (src.length - 1) ? 0 : src[i];
    }

    return dst;
  }
}