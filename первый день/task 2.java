import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(b != 0)
        System.out.println("Целая часть = " + a/b);
        System.out.println("Остаток = " + a%b);
    }
}
