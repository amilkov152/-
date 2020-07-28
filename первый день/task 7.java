import java.util.HashSet;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        HashSet<Integer> mySet = new HashSet<Integer>();
        for (int i = 1; i <= Math.ceil(Math.sqrt(value)); i++) {
            if (value % i == 0) {
                mySet.add(i);
                mySet.add(value/i);
            }
        }
        
        for (int i : mySet)
            System.out.println(i);
    }
}
