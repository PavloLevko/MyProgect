import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserMenu  extends Main {


   private static final String MAIN_MENU = "Hallo. You can to encrypt you text. \n" +
            "Please choose one of the methods. \n" +
            "1 - input path to file. \n" +
            "2 - encrypted shift by 6 characters.\n" +
            "3 - encrypted shift by 9 characters.\n" +
            "4 - decrypted the text"+
            "5 - to exit";
    private static final String EXIT ="Press 5 to exit.";
    private static final String START_METOD = "Please enter the file path.";
    public static boolean isRaning = true;








        public static void mainMenu () throws FileNotFoundException {

            System.out.println(MAIN_MENU);
            Scanner scan = new Scanner(System.in);

            while (isRaning) {
                String inputText = scan.nextLine();

                switch (inputText) {
                    case "1" -> {
                        System.out.println(START_METOD);
                        String pathScanner = scan.nextLine();

                        PathCheck.checkedPath(pathScanner);
                        break;
                    }
                    case "2" -> {

                        System.out.println("2");
                        break;
                    }
                    case "3" -> {

                        System.out.println("3");
                        break;
                    }
                    case "4" -> {

                        System.out.println("4");
                        break;
                    }
                    case "5" -> {

                        isRaning = false;
                        break;
                    }
                    default -> System.out.println("Program is finish.");


                }


            }
        }

    }





