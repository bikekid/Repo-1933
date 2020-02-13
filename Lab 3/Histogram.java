import java.util.Scanner;

public class Histogram{

  private int lowerBound;
  private int uppperBound;
  private int[] histArray;

  public Histogram (int lowerBound, int uppperBound){
    this.lowerBound = lowerBound;
    this.uppperBound = uppperBound;
    histArray = new int[uppperBound + 1];
    for (int i = 0; i < uppperBound; i++){
      histArray[i] = 0;
    }
}
  public boolean add(int i){
    if (lowerBound <= i && uppperBound >= i) {
      // Add to Histogram
      histArray[i] += 1;
      return(true);
    } else {
      return(false);
    }
  }
  public String toString(){
    String result = "";
    for (int j = lowerBound; j <= uppperBound; j++){
      String stars = "";

      for (int k = 0; k < histArray[j]; k++){
         stars += '*';
      }
      result += ("" + j + ": " + stars + "\n");

  }
  return (result);
}

  public static void main(String[] args) {
    Histogram e = new Histogram(4, 10);
    e.add(5);
    String x = e.toString();
    System.out.println(x);

  }
}
