package bat.coding.warmup1;

public class Main {
    public static void main(String[] args) {

    }


    /**
     * We sleep in if it is not a weekday or we're on vacation.
     *
     * @param weekday  is true if it is a weekday
     * @param vacation is true if we are on vacation
     * @return true if we sleep in
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }


    /**
     * @param n - integer value
     * @return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
     */
    public int diff21(int n) {
        if (n < 21) {
            return 21 - n;
        } else {
            return 2 * (n - 21);
        }
    }


    /**
     * @param n - integer value
     * @return true if it is within 10 of 100 or 200.
     */
    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }


    /**
     * The value of n will be a valid index of a char in the original string
     * (i.e. n will be in the range 0..str.length()-1 inclusive).
     *
     * @param str - string value
     * @param n   - integer value
     * @return a new string where the char at index n has been removed.
     */
    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1);
        return front + back;
    }


    /**
     * The original string will be length 1 or more.
     *
     * @param str - string value
     * @return a new string with the last char added at the front and back.
     */
    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }
}