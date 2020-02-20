//REEDX500
//Inspired by Complex4 in class example


public class Roots{
  private double realPart = 0;
  private double imaginaryPart = 0;

  //constructor
  public Roots(double realPart, double imaginaryPart){
    this.realPart = realPart;
    this.imaginaryPart = imaginaryPart;
  }
  //sets the real part of the root to the argument val
  public void setRealPart(double val){
    realPart = val;
  }
  //sets the inmaginary part of the root to the argument val
  public void setImaginaryPart (double val){
    imaginaryPart = val;
  }
  //returns real part of root
  public double getRealPart(){
    return realPart;
  }
  //returns real part of root
  public double getImaginaryPart(){
    return imaginaryPart;
  }
  //Adds both the real part and imaginary part of another root
  //to the current root
  public void addRoot(Roots c){
    realPart = realPart + c.getRealPart();
    imaginaryPart = imaginaryPart + c.getImaginaryPart();
  }
  //Subtracts both the real part and imaginary part of another root
  //to the current root
  public void subtractRoot(Roots c){
    realPart = realPart - c.getRealPart();
    imaginaryPart = imaginaryPart - c.getImaginaryPart();
  }
  //returns a string for the real and imaginary roots
  public String toString(){
    String s = "";
    if (imaginaryPart != 0){
      s = ("" + realPart + " + " +imaginaryPart + "i");
      return s;

    } else{
      s = ("" + realPart + " + " + (realPart * -1) );
      return s;
    }

  }
  public boolean equals (Object anotherObject){
    Roots temp;
    boolean same = false;
    if (anotherObject instanceof Roots) {
    temp = (Roots) anotherObject;
  }
    if (realPart == anotherObject.getRealPart() &&
    imaginaryPart == anotherObject.getImaginaryPart()){
    same = true;
  }
  return same;
  }

  public static void main(String[] args) {

  }
}
