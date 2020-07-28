package test;

public class main {

    public static void main(String[] args) {
        //Тестирование работы с числами типа int:
        IntVal first = new IntVal(3,2);
        IntVal second = new IntVal(-1,2);
        IntVal res = first.multiplication(second);
        System.out.println(res.getReal() + " " + res.getImaginary());

        //Тестирование работы с числами типа double
        DoubleVal one = new DoubleVal(3.0,2.0);
        DoubleVal two = new DoubleVal(-1.0,2.0);
        DoubleVal ans = one.multiplication(two);
        System.out.println(ans.getReal() + " " + ans.getImaginary());
    }
}
