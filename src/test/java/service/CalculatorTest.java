package service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  Calculator calculator = new Calculator();

  @Test
  void testAdd() {
    int expected = 3;

    int actual = calculator.add(1, 2);

    assertEquals(expected, actual);
  }

  @Test
  void testSubtract() {
    int expected = 3;

    int actual = calculator.subtract(5, 2);

    assertEquals(expected, actual);
  }

  @Test
  void testMultiply() {
    int expected = 6;

    int actual = calculator.multiply(2, 3);

    assertEquals(expected, actual);
  }

  @Test
  void testDivide() {
    int expected = 2;

    int actual = calculator.divide(6, 3);

    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @ValueSource(ints = {2, -2, -100000, 200000})
  public void testIsEven(int number) {
    boolean actual = calculator.isEven(number);

    assertTrue(actual);
  }

  @Test
  void testIsOdd() {
    boolean actual = calculator.isEven(3);

    assertFalse(actual);
  }

  @Test
  void testIncrementArray() {
    int[] expected = new int[]{2, 3, 4};

    int[] actual = calculator.incrementArray(new int[]{1, 2, 3});

    assertArrayEquals(expected, actual);
  }

  @Test
  void testDivideByZero() {
    Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));

    String expected = "/ by zero";

    String actual = exception.getMessage();

    assertEquals(expected, actual);
  }

}
