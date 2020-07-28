package test;

public class Complex<T> {
    private  T real;
    private T imaginary;

    Complex(T real, T imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public T getReal() {
        return real;
    }

    public T getImaginary() {
        return imaginary;
    }
}
