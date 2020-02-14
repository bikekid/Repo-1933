//REEDX500

class Random {

  private static int p1 = 0;
  private static int p2 = 0;
  private static int m = 0;
  private static int s = 0;
  private static int rNew = 0;
  private static int lowerInt = 0;
  private static int upperInt = 0;
  private static int rOld = 0;
  private static int val = 0;
  private static int[] options;
  private static boolean found = false;
  private static int randGen = 0;


  // constructor
  public Random(int p1, int p2, int m){
    this.p1 = p1;
    this.p2 = p2;
    this.m = m;
  }

  //sets the seed in the random number generator
  public void setSeed(int seed){
    s = seed;
  }

  //Return the value of M for this random number generator.
  public int getMaximum(){
    return (m);
  }

  //Use the sequential random number algorithm to generate thernewvalue  and  return  it.
  // If  this  method  is  called  again  without  resetting  the  seed,
  //it  shouldgenerate a different value.
  public int random(){
    rNew = ((p1 * s) + p2) % m;
    return rNew;
  }

  //Return a random integer in the range lower to upper.
  public int randomInteger(int lower, int upper){
    if (lower > upper) {
      // I did this because if we swapped values it would be difficult to change
      //them. Assigning to new variables is easy bc I don't have to worry about values
      //being altered.

       lowerInt = upper;
       upperInt = lower;

    } else {
       lowerInt = lower;
       upperInt = upper;
    }

    options = new int [(upperInt - lowerInt)];


    // creates an array of integers

    for (int i = lowerInt; i < upperInt; i++){
      options[i - lowerInt] = i;
    }
    //calls a random number and each number is checked to see
    //if it is in the options array
    while (found != true){
      randGen = random();

      for (int j = 0; j < options.length; j++){
        if (randGen == options[j]) {
          found = true ;
      }
    }
  }
  return randGen;
}
  // //Randomly return true or false
  // public boolean randomBoolean(){
  //
  //
  // }
  //
  // //Get  a  random  double  inthe range lower to upper.
  // public double randomDouble(double lower, double upper){
  //
  // }

  public static void main(String[] args) {
    Random firstTest = new Random(8172327,65537,53);
    firstTest.setSeed(8);

    System.out.println(firstTest.randomInteger(20,10));
    System.out.println(firstTest.randomInteger(20,10));
    System.out.println(firstTest.randomInteger(20,10));
    System.out.println(firstTest.randomInteger(20,10));
    System.out.println(firstTest.randomInteger(20,10));

  }
}
