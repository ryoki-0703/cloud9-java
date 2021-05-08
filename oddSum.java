public class oddSum {

  public static void main(String[] args) {
    int oddSum = 0;

    for (int i = 1; i <= 100; i++) {
      if (i % 2 != 0) {
        oddSum += i;
      }
    }
    System.out.print(oddSum);
  }
}