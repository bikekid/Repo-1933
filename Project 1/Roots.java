public class Roots{
  private double realPart = 0;
  private double imaginaryPart = 0;

  public Roots(double realPart, double imaginaryPart){
    this.realPart = realPart;
    this.imaginaryPart = imaginaryPart;
  }
  public void setRealPart(double val){
    realPart = val;
  }
  public void setImaginaryPart (double val){
    imaginaryPart = val;
  }
  public double getRealPart(){
    return realPart;
  }
  public double getImaginaryPart(){
    return imaginaryPart;
  }
  public void addRoot(Roots c){
    realPart = realPart + c.getRealPart();
    imaginaryPart = imaginaryPart + c.getImaginaryPart();
  }
  public void subtractRoot(Roots c){
    realPart = realPart - c.getRealPart();
    imaginaryPart = imaginaryPart - c.getImaginaryPart();
  }
  // public boolean equals (Object anotherObject){
  //   Roots temp;
  //   boolean same = false;
  //   if (anotherObject instanceof Roots) {
  //   temp = (Roots) anotherObject;
  // }
  //   if (realPart == anotherObject.getRealPart() &&
  //   imaginaryPart == anotherObject.getImaginaryPart()){
  //   same = true;
  // }
  // return same;
  // }

  public static void main(String[] args) {

  }
}
