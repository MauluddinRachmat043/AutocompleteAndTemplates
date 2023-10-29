import java.util.Random;

/**
 * Kelas `PasswordGenerator` digunakan untuk menghasilkan kata sandi acak berdasarkan preferensi pengguna.
 */
public class PasswordGenerator {
    private int length; // Panjang kata sandi
    private boolean useUppercase; // Gunakan huruf besar
    private boolean useLowercase; // Gunakan huruf kecil
    private boolean useNumbers; // Gunakan angka
    private boolean useSpecialCharacters; // Gunakan karakter khusus

    /**
     * Konstruktor untuk kelas `PasswordGenerator`.
     *
     * @param length               Panjang kata sandi yang akan dihasilkan.
     * @param useUppercase         Gunakan huruf besar (A-Z) dalam kata sandi.
     * @param useLowercase         Gunakan huruf kecil (a-z) dalam kata sandi.
     * @param useNumbers           Gunakan angka (0-9) dalam kata sandi.
     * @param useSpecialCharacters Gunakan karakter khusus dalam kata sandi.
     */
    public PasswordGenerator(int length, boolean useUppercase, boolean useLowercase, boolean useNumbers, boolean useSpecialCharacters) {
        this.length = length;
        this.useUppercase = useUppercase;
        this.useLowercase = useLowercase;
        this.useNumbers = useNumbers;
        this.useSpecialCharacters = useSpecialCharacters;
    }
    //asd

    /**
     * Metode ini digunakan untuk menghasilkan kata sandi acak berdasarkan preferensi pengguna.
     *
     * @return Kata sandi acak yang memenuhi kriteria yang ditentukan.
     */
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
            // Jika tidak ada set karakter yang dipilih, kembalikan kata sandi kosong.
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
