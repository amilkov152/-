package test;

public class IntVal extends Complex<Integer> {

    IntVal(Integer real, Integer imaginary) {
        super(real, imaginary);
    }

    public IntVal sum (IntVal second){
        return new IntVal(this.getReal()+second.getReal(),this.getImaginary()+second.getImaginary());
    }

    public IntVal subtraction (IntVal second){
        return new IntVal(this.getReal() - second.getReal(),this.getImaginary() - second.getImaginary());
    }

    public IntVal multiplication (IntVal second){
        Integer r =this.getReal() * second.getReal() - (this.getImaginary()*second.getImaginary());
        Integer im = this.getReal() * second.getImaginary() + (second.getReal()*this.getImaginary());
        return new IntVal(r,im);
    }
}
