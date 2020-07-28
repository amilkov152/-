import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        boolean simple = true;

        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                simple = false;
                break;
            }
        }
        System.out.println(simple);
    }
}
