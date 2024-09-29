import java.util.Scanner;
/**
 * PemilihanHari02
 */
public class PemilihanHari02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName, dayTipe;
        
        System.out.print("Input day name: ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayTipe = "weekday";                
                break;
            default:
                dayTipe = "invalid day name";
        }
        System.out.println(dayName + " is a " + dayTipe);
    }
}