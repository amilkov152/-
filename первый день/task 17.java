package demo;


import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][7];
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 7; ++j) {
                arr[i][j] = (int) (Math.random() * (9 - 0) + 0);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 6; ++i)
            for (int j = 6; j >= 1; --j) {
                if (arr[i][j] > arr[i][j - 1]) {
                    int tmp = arr[i][j];
                    arr[i][j] = arr[i][j - 1];
                    arr[i][j - 1] = tmp;
                }
            }

        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 7; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
