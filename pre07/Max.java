public class Max {

  public static int indexOfMax (int[] a) {

    int iMax = 0;

    for (int i = 1; i < a.length; i++) {
      if (a[i] > a[iMax])
          iMax = i;
    }
     System.out.println(iMax);
    return iMax;
  }

  public static void main (String[] args) {

    int [] a = { 1, 6, 3, 14, 13, 11};
    indexOfMax(a);
  }
}