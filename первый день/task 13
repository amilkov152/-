package demo;

import java.util.Scanner;

public class test {

    public  static void add(float[] arr, int n){
        arr[n] = arr[n] + arr[n]*0.1f;
    }

    public static void show(float[] arr, int len){
        for(int i = 0; i < len; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }

    public static void message(){
        System.out.println("Выберите нужный пункт:" + "\n" + "1 - Вывести массив"+ "\n" + "2 - Увеличить элемент массива на 10%" + "\n" + "3 - Выход");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int len = scanner.nextInt();
        int menu = 0;
        float[] arr = new float[len];
        for (int i = 0; i < len; ++i)
            arr[i] = (float) (Math.random()*10 - 5);
        message();
        menu = scanner.nextInt();
        while (menu != 3){
            switch (menu){
                case 1:
                    System.out.println("Выводим массив:");
                    show(arr,len);
                    message();
                    menu = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Укажите номер элемента, который надо увеличить:");
                    int n = scanner.nextInt();
                    if(n<len) {
                        add(arr, n);
                        System.out.println("Элемент увеличен");
                    }
                    else
                        System.out.println("элемента с таким индексом нет");
                    message();
                    menu = scanner.nextInt();
                    break;
                case 3:
                    menu = 3;
                    break;
                default:
                    System.out.println("Такого пункта меню нет! Выберите из предложенных");
                    message();
                    menu = scanner.nextInt();
            }
        }

    }
}
