package service;

import java.util.Arrays;
import java.time.Month;

public class DateChecker {

  public boolean has31DaysIn2023(Month month) {
    return Arrays.asList
                     (Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY, Month.AUGUST, Month.OCTOBER, Month.DECEMBER)
                 .contains(month);

  }


}
