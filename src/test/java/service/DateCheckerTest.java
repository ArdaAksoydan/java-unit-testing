package service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DateCheckerTest {

  DateChecker dateChecker = new DateChecker();

  @ParameterizedTest
  @EnumSource(value = Month.class, names = {"JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"})
  void testHas31DaysIn2023(Month month) {
    assertTrue(dateChecker.has31DaysIn2023(month));
  }

  @ParameterizedTest
  @EnumSource(value = Month.class, names = {"FEBRUARY", "JUNE", "SEPTEMBER", "NOVEMBER"})
  void testDoesNotHave31DaysIn2023(Month month) {
    assertFalse(dateChecker.has31DaysIn2023(month));
  }

}