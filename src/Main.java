import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char[] characters = {'#', 'a', 'A', '1', 'b', 'B', 'c', 'C', '$', 'd', 'D', '2', 'e', 'E',
                             '%', 'f', 'F', 'g', 'G', '4', 'h', 'H', '&', 'i', 'I', 'j', 'J', '5',
                             'k', 'K', '*', 'l', 'L', 'm', 'M', '6', 'n', 'N', '+', 'o', 'O', 'p',
                             'P', '7', 'q', 'Q', '[', 'r', 'R', 's', 'S', '8', 't', 'T', ']', 'u',
                             'U', 'v', 'V', '9', 'w', 'W', '!', 'x', 'X', 'y', 'Y', '0', 'z', 'Z',
                             '@'};

        System.out.print("Length: ");
        length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            int number = random.nextInt(0, characters.length + 1);
            System.out.print(characters[number]);
        }
    }
}