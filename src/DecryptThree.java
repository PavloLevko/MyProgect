public class DecryptThree extends MyFileRider {
    private static final String AFTER_ENCRYPTED = "You text after decrypted.";
    private static final int numberThree = 3;
    private static final int buferValue = 100;
    static char[] arrayAfterDecrypted = new char[buferValue];
    private static final int key = 1;

    public void decryptedToThree(char[] array) {
        for (int i = 0; i < array.length; i++) {
            char charFromArray = array[i];
            int codeChar = charFromArray - numberThree;
            arrayAfterDecrypted[i] = (char) codeChar;
        }
        System.out.println(arrayAfterDecrypted);
        System.out.println(AFTER_ENCRYPTED);
    }
}



