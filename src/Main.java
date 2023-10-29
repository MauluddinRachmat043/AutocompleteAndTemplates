import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang password : ");
        int length = scanner.nextInt();

        System.out.print("Buat berapa password : ");
        int many = scanner.nextInt();
        PasswordGenerator passwordGenerator = new PasswordGenerator(length, true, true, true, true);

        for (int i=0; i<many; i++) {
            String password = passwordGenerator.generatePassword();
            System.out.println((i+1)+". Passwordnya adalah : " + password);
        }
    }
}