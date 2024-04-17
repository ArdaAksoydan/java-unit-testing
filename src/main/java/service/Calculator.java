package service;

import java.util.Arrays;

public class Calculator {

  public int add(int x, int y) {
    return x + y;
  }

  public int subtract(int x, int y) {
    return x - y;
  }

  public int multiply(int x, int y) {
    return x * y;
  }

  public int divide(int x, int y) {
    return x / y;
  }

  public boolean isEven(int i) {
    return i % 2 == 0;
  }

  public int[] incrementArray(int[] values) {
    return Arrays.stream(values)
                 .map(num -> num + 1)
                 .toArray();
  }

}
