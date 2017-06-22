package third;

import java.util.Date;

/**
 * Created by Kushn_000 on 15.05.2017.
 */
public class Test {
    private double aDouble;
    private String string;
    private Date date;

    public Test(double aDouble, String string, Date date) {
        this.aDouble = aDouble;
        this.string = string;
        this.date = date;
    }

    public double getaDouble() {
        return aDouble;
    }

    public String getString() {
        return string;
    }

    public Date getDate() {
        return date;
    }
}
