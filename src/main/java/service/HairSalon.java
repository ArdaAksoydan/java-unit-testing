package service;

import java.time.DayOfWeek;
import java.util.Arrays;

public class HairSalon {

  private static final int HAIRCUT_PRICE = 30;

  private static final int DISCOUNT = 2;

  private static final DayOfWeek[] OPENING_DAYS = {DayOfWeek.MONDAY, DayOfWeek.TUESDAY};

  private final Calculator calculator = new Calculator();

  public DayOfWeek[] getOpeningDays() {
    return OPENING_DAYS;
  }

  public boolean isOpen(DayOfWeek day) {
    return Arrays.asList(OPENING_DAYS).contains(day);
  }

  public int getHaircutPrice() {
    return HAIRCUT_PRICE;
  }

  public int applyDiscount() {
    return calculator.divide(HAIRCUT_PRICE, DISCOUNT) + 5;
  }

}
