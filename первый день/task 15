package demo;


import java.util.Scanner;



public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение чисел");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        float d = (b*b) - 4*a*c;
        if(d>0)
        {
            System.out.println("Уравнение имеет два корня:");
            System.out.println("Первый корень: " + (-b-Math.sqrt(d))/(2*a));
            System.out.println("Второй корень: " + (-b+Math.sqrt(d))/(2*a));
        }
        else if(d==0)
        {
            System.out.println("Уравнение имеет один корень:");
            System.out.println("Первый корень: " + (-b-Math.sqrt(d))/(2*a));
        }
        else {
            System.out.println("Уравнение вещественных корней не имеет");
        }

    }
}

