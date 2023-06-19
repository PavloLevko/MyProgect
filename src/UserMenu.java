import java.util.Scanner;

public class UserMenu extends Main {
    public static final String HALLO = "Hallo! ";
    public static final String EMPTHYPATH = "Empthy path! Try again.";
    public static final String IMPUTPATH = "Please input path to file.";
    public static final String CORRECTPATH = "Correct path to file";
    public static boolean isRaning;
    public static String PATH;


    public static void sayHallo() {

        System.out.println(HALLO);
    }

    public static void scanPath() {
        Scanner scan = new Scanner(System.in);

        while (isRaning = true) {
            System.out.println(IMPUTPATH);
            PATH = scan.nextLine();

            if (MyFileRider.file.exists()) {

                System.out.println(CORRECTPATH);

            } else if (PATH.isEmpty()) {
                System.out.println(CORRECTPATH);


                isRaning = false;


            }

        }

    }

}
