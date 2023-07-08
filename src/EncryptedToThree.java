public class EncryptedToThree extends MyFileRider {
    private static final String AFTER_ENCRYPTED = "You text after encrypted.";
    private static final int numberThree = 3;
    private static final int buferValue = 100;
    static char[] arrayAfterEncrypted = new char[buferValue];
    public static void encryptedToThree(char[] array) {
        for (int i = 0; i < array.length; i++) {
            char charFromArray = array[i];
            int codeChar = charFromArray + numberThree;
            arrayAfterEncrypted[i] = (char) codeChar;
        }
        System.out.println(arrayAfterEncrypted);
        System.out.println(AFTER_ENCRYPTED);
    }
}