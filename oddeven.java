class oddeven {
  public static void main(String[] args) {
    int evenSum = 0;
    int oddSum = 0;

    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      } else {
        oddSum += i;
      }
    }

    System.out.println("偶数は和は" + evenSum);
    System.out.println("奇数は和は" + oddSum);
  }
}