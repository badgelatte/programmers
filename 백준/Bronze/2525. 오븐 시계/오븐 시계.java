import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minutes = sc.nextInt();
        
        int plusMin = sc.nextInt();
        
        minutes += plusMin;

        if (minutes >= 60) {
            hour += (minutes / 60);
            minutes %= 60;
        }
        if (hour >= 24) {
            hour %= 24;
        }
        
        System.out.print(hour + " " + minutes);
    }
}