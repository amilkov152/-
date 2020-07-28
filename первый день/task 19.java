package demo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str="";
        for(int i = 0; i < n; ++i){
            str +="I";
        }
        System.out.println( str.replace("IIIII", "V").replace("IIII", "IV").replace("VV", "X").replace("VIV", "IX").replace("XXXXX", "L").replace("XXXX", "XL").replace("LL", "C"));

    }
}

