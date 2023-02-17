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
}