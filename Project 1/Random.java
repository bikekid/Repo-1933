//REEDX500

class Random {

  private int p1 = 0;
  private int p2 = 0;
  private int m = 0;
  private int rNew = 0;
  private int lowerInt = 0;
  private int upperInt = 0;
  private int randGen = 0;
  private int randGenD =0;
  private double randNum;
  private double up = 0.0;
  private double low = 0.0;
  private double randDoub = 0.0;
  private boolean found = false;

  // constructor
  public Random(int p1, int p2, int m){
    this.p1 = p1;
    this.p2 = p2;
    this.m = m;
  }

  //sets the seed in the random number generator
  public void setSeed(int seed){
    rNew = seed;
  }

  //Return the value of M for this random number generator.
  public int getMaximum(){
    return (m);
  }

  //Use the sequential random number algorithm to generate thernewvalue  and  return  it.
  // If  this  method  is  called  again  without  resetting  the  seed,
  //it  shouldgenerate a different value.
  public int random(){
    rNew = ((p1 * rNew) + p2) % m;
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
  randGen = random();
  int difference = (randGen % (upper-lower) + lower);
  return difference;
}

  //Randomly return true or false
  public boolean randomBoolean(){
    randGen = random();
    int choice = (randGen % 6);//creates a choice variable of mod 6 just to give more options
    if (choice == 1 || choice == 3 || choice == 5) {//this determines if it is either of these (50% chance) then it is true
      return true;
    }else{
      return false;
    }
  }

  // //Get  a  random  double  in the range lower to upper.
  public double randomDouble(double lower, double upper){
    // I did this because if we swapped values it would be difficult to change
    //them. Assigning to new variables is easy bc I don't have to worry about values
    //being altered.

    if (lower > upper) {

       low = upper;
       up = lower;

    } else {
       low = lower;
       up = upper;
    }
    // found = false;

    // while (found != true){
      randGenD = random();
      double randNum = randGenD / (up - low);
      double randDoub = (low + randNum);
    //   if (randDoub <= up && randDoub >= low){
    //     found = true;
    //   }
    // }
  return randDoub;
  }

  public static void main(String[] args) {
    Random RandChoices = new Random(71,11,771);
    RandChoices.setSeed(13);
    for(int i = 0; i < 5; i++){
      System.out.println(RandChoices.randomDouble(6.1234, 4.231274322));
      System.out.println(RandChoices.randomInteger(50,100));
  }
}
}
