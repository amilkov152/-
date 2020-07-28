import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float value = scanner.nextInt();
        System.out.printf("%.2f", value*0.17);
    }
}
