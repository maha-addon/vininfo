public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        boolean leap = false;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            leap = true;

        System.out.println("Leap Year: " + leap);
    }
}