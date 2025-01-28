public class Weekdays {
    public static void main(String[] args) {
        Weekdays day = new Weekdays();
        day.WeekdaysName(3);
        day.WeekdaysName(5);
        day.WeekdaysName(1);
        day.WeekdaysName(7);
        day.WeekdaysName(2);
        day.WeekdaysName(6);
        day.WeekdaysName(4);
    }

    public void WeekdaysName(int number) {
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid input! Please enter a number between 1 to 7.");
        }
    }
}
