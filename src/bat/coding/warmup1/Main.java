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


    /**
     * @param str - string value
     * @return true if the string starts with "hi" and false otherwise.
     */
    public boolean startHi(String str) {
        char[] c = str.toCharArray();
        if (!(c.length < 2)) {
            if (c[0] == 'h') {
                return c[1] == 'i';
            }
        }
        return false;
    }


    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 3 int values, return true if 1 or more of them are teen. */
    public boolean hasTeen(int a, int b, int c) {
        int counter = 0;
        int[] numbers = {a, b, c};
        for (int number : numbers) {
            if (number >= 13 && number <= 19) {
                counter++;
            }
        }
        return counter > 0;
    }


    /**
     * @param str - string value
     * @return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
     */
    public boolean mixStart(String str) {
        char[] c = str.toCharArray();
        if (!(c.length < 3)) {
            return c[1] == 'i' && c[2] == 'x';
        }
        return false;
    }


    /**
     * @param a - integer value
     * @param b - integer value
     * @return whichever value is nearest to the value 10, or return 0 in the event of a tie.
     */
    public int close10(int a, int b) {
        int CONST = 10;
        int diffA = Math.abs(a - CONST);
        int diffB = Math.abs(b - CONST);
        if (diffA < diffB) {
            return a;
        } else if (diffA > diffB) {
            return b;
        }
        return 0;
    }
}