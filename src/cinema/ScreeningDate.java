package cinema;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dorka on 18.07.2017.
 */
public class ScreeningDate {
  private String day;

    public String getDay() {
        return day;
    }

    public String getHour() {
        return hour;
    }

    private String hour;

    public ScreeningDate(String day, String hour) {
        this.day = day;
        this.hour = hour;
    }
}
