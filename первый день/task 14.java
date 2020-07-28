package demo;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = (int) (Math.random() * (122 - 97) + 97);
        System.out.println("Введите латинскую строчную букву:");
        String ans = new String(scanner.next());
        char[] b = ans.toCharArray();
        char res = b[0];
        while (a != res){
            if(res > a) {
                System.out.println("буква больше заданной");
                ans = new String(scanner.next());
                b = ans.toCharArray();
                res = b[0];
            }
            else{
                System.out.println("буква меньше заданной");
                ans = new String(scanner.next());
                b = ans.toCharArray();
                res = b[0];
            }
        }
        System.out.println("Вы победили");
    }

}
