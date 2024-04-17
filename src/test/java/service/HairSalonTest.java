package service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class HairSalonTest {

  HairSalon hairSalon = new HairSalon();

  @Test
  void testGetOpeningDays() {
    DayOfWeek[] expected = new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.TUESDAY};

    DayOfWeek[] actual = hairSalon.getOpeningDays();

    assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @EnumSource(value = DayOfWeek.class, names = {"MONDAY", "TUESDAY"})
  void testSalonIsOpen(DayOfWeek day) {
    assertTrue(hairSalon.isOpen(day));
  }

  @ParameterizedTest
  @EnumSource(value = DayOfWeek.class, names = {"WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"})
  void testSalonIsClosed(DayOfWeek day) {
    assertFalse(hairSalon.isOpen(day));
  }

  @Test
  void testNull() {
    assertFalse(hairSalon.isOpen(null));
  }

  @Test
  void testHalfPriceDiscount() {
    int expected = 20;

    int actual = hairSalon.applyDiscount();

    Calculator calculator = new Calculator();
    assumeTrue(calculator.divide(hairSalon.getHaircutPrice(), 2) == 15);

    assertEquals(expected, actual);
  }

}