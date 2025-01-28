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
        day.WeekdaysName(10);
    }

    public void WeekdaysName(int number) {
        switch (number) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 to 7.");
        }
    }
}
