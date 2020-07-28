package test;

public class DoubleVal extends Complex<Double>{
    DoubleVal(Double real, Double imaginary) {
        super(real, imaginary);
    }
    public DoubleVal sum (DoubleVal second){
        return new DoubleVal(this.getReal()+second.getReal(),this.getImaginary()+second.getImaginary());
    }

    public DoubleVal subtraction (DoubleVal second){
        return new DoubleVal(this.getReal() - second.getReal(),this.getImaginary() - second.getImaginary());
    }

    public DoubleVal multiplication (DoubleVal second){
        Double r =this.getReal() * second.getReal() - (this.getImaginary()*second.getImaginary());
        Double im = this.getReal() * second.getImaginary() + (second.getReal()*this.getImaginary());
        return new DoubleVal(r,im);
    }

}
