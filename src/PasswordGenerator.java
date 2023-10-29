import java.util.Random;

public class PasswordGenerator {
    private int length;
    private boolean useUppercase;
    private boolean useLowercase;
    private boolean useNumbers;
    private boolean useSpecialCharacters;

    public PasswordGenerator(int length, boolean useUppercase, boolean useLowercase, boolean useNumbers, boolean useSpecialCharacters) {
        this.length = length;
        this.useUppercase = useUppercase;
        this.useLowercase = useLowercase;
        this.useNumbers = useNumbers;
        this.useSpecialCharacters = useSpecialCharacters;
    }

    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String numberChars = "0123456789";
        String specialChars = "!@#$%^&*()_+";

        String allChars = "";
        if (useUppercase) {
            allChars += uppercaseChars;
        }
        if (useLowercase) {
            allChars += lowercaseChars;
        }
        if (useNumbers) {
            allChars += numberChars;
        }
        if (useSpecialCharacters) {
            allChars += specialChars;
        }

        if (allChars.isEmpty()) {
            // If no character set is selected, return an empty password.
            return "";
        }

        Random random = new Random();
        int allCharsLength = allChars.length();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharsLength);
            char randomChar = allChars.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }
}
