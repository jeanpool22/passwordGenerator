import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                             'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B',
                             'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                             'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4',
                             '5', '6', '7', '8', '9', '0', '#', '$', '%', '&', '*', '+', '[', ']',
                             '!'};

        System.out.print("Length: ");
        length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            int number = random.nextInt(0, characters.length + 1);
            System.out.print(characters[number]);
        }
    }
}