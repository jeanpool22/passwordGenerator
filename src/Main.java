import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String[] caracteres = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                               "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B",
                               "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
                               "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4",
                               "5", "6", "7", "8", "9", "0", "#", "$", "%", "&", "*", "+", "[", "]"};

        for (int i = 0; i < 12; i++) {
            int numero = random.nextInt(0, caracteres.length + 1);
            System.out.print(caracteres[numero]);
        }
    }
}