//REEDX500

class Quadratic{

  private float a;
  private float b;
  private float c;

  public Quadratic(float a, float b, float c){
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public Quadratic add(Quadratic other){
    Quadratic AddedQuadratic = new Quadratic(a + other.a, b + other.b, c + other.c);

    return AddedQuadratic;

  }
  public Quadratic subtract(Quadratic other){
    Quadratic SubbQuadratic = new Quadratic(a - other.a, b - other.b, c - other.c);

    return SubbQuadratic;
  }

  public Roots findRoots(){
    // Quadratic formula
    double inside = (Math.pow(b,2) - 4 * a * c);
    if (inside < 0){
      inside = inside * -1;
      double insideSQrtd = Math.pow(inside, 0.5);
      insideSQrtd = insideSQrtd/((double)2 * (double) a);

      double real = -b/(2 * a);

      Roots quadRoots = new Roots(real, insideSQrtd);
      return quadRoots;
    } else {
    double insideSQrtd = Math.pow(inside, 0.5);

    double firstRootInside= ((-b + insideSQrtd)/(2*a));
    double imagRoot = 0;

    Roots quadRoots = new Roots(firstRootInside,imagRoot);
    return quadRoots;
  }

  }

  public String toString(){
    String quad = ("" + a + "x^2 + " + b +"x + "+ c);
    return quad;
  }

  //checks to see if they are the same objecttype
  public boolean equals(Object other){

    //checks to see if other is a Quadratic object
    if (!(other instanceof Quadratic)){
      return false;
    }

    Quadratic x = (Quadratic) other;


    //Since x is converted into a Quadratic class, it is possible to call functions
    //calling subtract, subtracts the class from x
    Quadratic y = subtract(x);
    //if the subtracted class has values less that .0001 then they are identical
    if (y.a <= 0.0001 && y.b <= 0.0001 && y.c <= 0.0001){
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    float x = 3.0007f;
    float y = 3.0007f;
    float z = 1.0007f;

    float a = 3.0007f;
    float b = 3.0070f;
    float c = 1.00071f;



    Quadratic testQuad = new Quadratic(x, y, z);
    Quadratic compQuad = new Quadratic(a, b, c);
    System.out.println(testQuad.equals(compQuad));
    System.out.println(compQuad.toString());
    Roots rooty = compQuad.findRoots();
    System.out.println(rooty.toString());

  }

}
