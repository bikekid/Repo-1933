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
    //integrate equals function before

    Quadratic AddedQuadratic = new Quadratic(a + other.a, b + other.b, c + other.c);

    return AddedQuadratic;

  }
  public Quadratic subtract(Quadratic other){
    Quadratic SubbQuadratic = new Quadratic(a - other.a, b - other.b, c - other.c);

    return SubbQuadratic;
  }

  // public roots()

  //checks to see if they are the same objecttype

  public boolean equals(Object other){


    if (!(other instanceof Quadratic)){
      return false;
    }

    Quadratic x = (Quadratic) other;

  //   if ((x.a - a <= 0.0001) && (x.b - b <= 0.0001) && (x.c - c <= 0.0001)){
  //     return true;
  //   } else {
  //     return false;
  //   }
  // }

  //
    Quadratic y = this.subtract(x);
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

    float a = 3.0000f;
    float b = 6.0070f;
    float c = 1.0020f;



    Quadratic testQuad = new Quadratic(x, y, z);
    Quadratic compQuad = new Quadratic(a, b, c);
    System.out.println(testQuad.equals(compQuad));

  }

}
