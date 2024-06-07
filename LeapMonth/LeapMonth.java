public class LeapMonth {

    public static void main(String[] args) {
        int year = 2024; 
        boolean isLeapMonth = isLeapYear(year);
        System.out.println("Year " + year + " is a leap year: " + isLeapMonth);
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (year % 100 != 0) || (year % 400 == 0);
        return isLeapMonth;
    }
}

