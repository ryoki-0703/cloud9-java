class evenSum {
  public static void main(String[] args) {
    int evenSum = 0;

    for (int i = 0; i < 100; i++) {
      if (i % 2 == 0) {
        evenSum += i++;
      }
    }
    System.out.print(evenSum);
  }
}