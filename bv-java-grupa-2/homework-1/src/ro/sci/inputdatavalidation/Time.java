/**
 * this method validates the time and returns the str string. If the time is valid, returns the time,
 * if not, returns a message.
 *
 * @author Cristian S.
 */

package ro.sci.inputdatavalidation;

public class Time {
    public static String time(int hh, int mm) {
        String str = null;
        if (hh >= 0 && hh < 24 && mm >= 0 && mm < 60) {
            str = "The time is " + ((hh < 10 ? "0" : "") + hh) + ":" + ((mm < 10 ? "0" : "") + mm) + " now.";
        } else {
            str = "Incorrect time!";
        }
        return str;
    }
}