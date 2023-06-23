import java.util.SortedMap;

public class EncryptedToThree extends MyFileRider {
    private static final String AFTER_ENCRYPTED = "You text after encrypted.";
    static char[] arrayAfterEncrypted = new char[100];

    public static void encryptedToThree(char[] array) {

        for (int i = 0; i < array.length; i++) {
            char charFromArray = array[i];
            int codeChar = charFromArray + 3;
            arrayAfterEncrypted[i] = (char) codeChar;
        }
        System.out.println(arrayAfterEncrypted);
        System.out.println(AFTER_ENCRYPTED);


    }
}






