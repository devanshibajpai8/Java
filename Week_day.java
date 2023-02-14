import java.util.Scanner;

class Week_day {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of the day:");
        int day = s.nextInt();
        System.out.print(day_name(day));
        s.close();
    }
    public static String day_name(int day) {
        String name = "";
        switch (day) {
            case 1:
                name = "Tuesday";
                break;

            case 2:
                name = "Wednesday";
                break;

            case 3:
                name = "Thursday";
                break;

            case 4:
                name = "Friday";
                break;

            case 5:
                name = "Saturday";
                break;

            case 6:
                name = "Sunday";
                break;

            case 7:
                name = "Monday";
                break;

            default:
                name = "Invalid input";
        }
        return name;
    }
}
