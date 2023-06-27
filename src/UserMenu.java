import java.io.FileNotFoundException;
import java.util.Scanner;
public class UserMenu  extends Main {
   private static final String MAIN_MENU = "Hallo. You can to encrypt you text. \n" +
            "Please choose one of the methods. \n" +
            "1 - input path to file. \n" +
            "2 - encrypted shift by 3 characters.\n" +
            "3 - encrypted shift by 6 characters.\n" +
            "4 - decrypted the text 3 characters.\n"+
            "5 - decrypted the text 3 characters.\n" +
           "0 - BruteForce.\n" +
           "Press Enter to exit.";
    public static final String BRUTE_FORCE_INFO = "You select Brute Force.";
    private static final String START_METOD = "Please enter the file path.";
    public static boolean isRaning = true;
    public static String  pathScanner;
        public static void mainMenu () throws FileNotFoundException {
            System.out.println(MAIN_MENU);
            Scanner scan = new Scanner(System.in);
            while (isRaning) {
                String inputText = scan.nextLine();
                switch (inputText) {
                    case "1" -> {
                        System.out.println(START_METOD);
                        pathScanner = scan.nextLine();
                        PathCheck.checkedPath(pathScanner);
                        break;
                    }
                    case "2" -> {
                        EncryptedToThree.encryptedToThree(MyFileRider.charsArrayAfterRead);
                        break;
                    }
                    case "3" -> {
                        EncryptedToSix.encryptedToSix(MyFileRider.charsArrayAfterRead);
                        break;
                    }
                    case "4" -> {
                        DecryptThree.decryptedToThree(EncryptedToThree.arrayAfterEncrypted);
                        break;
                    }
                    case "5" -> {
                        DecryptSix.decryptedToSix(EncryptedToSix.arrayAfterEncrypted);
                        break;
                    }
                    case "0" -> {
                        System.out.println(BRUTE_FORCE_INFO);
                        System.out.println(START_METOD);
                        pathScanner = scan.nextLine();
                        PathCheck.checkedPath(pathScanner);
                        BruteForce.bruteForse(MyFileRider.charsArrayAfterRead);
                        BruteForce.selectDecryptMetod(BruteForce.valueSpaceThree, BruteForce.valueSpaceSix);
                    }
                    default -> {
                        System.out.println("Program is finish.");
                        return;
                    }
                }
            }
        }
}





