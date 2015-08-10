import java.io.Console;
import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {}
    //  Console myConsole = System.console();
    //  System.out.println("Enter a number");
    //  String userNum = myConsole.readLine();
    //  System.out.println("enter a number");




  public Boolean isNumber(String userNum) {
      Integer userInput = 0;
      try {
    userInput = Integer.parseInt(userNum);
        if (userInput <0) {
            return false;
        }
    } catch (NumberFormatException e) {
        return false;
    }
    return true;
  }

  public ArrayList pingPong (Integer iNum) {
     ArrayList<String> numList = new ArrayList<String>();

      for ( int i = 1; i <= iNum; i++ ) {
          if (i % 15 == 0){
              numList.add("ping pong");
          } else if (i % 5 == 0){
              numList.add("pong");
          } else if (i % 3 == 0)  {
              numList.add("ping");
          } else {
              String stringI = Integer.toString(i);
              numList.add(stringI);
          }
      }

     return numList;
  }
}
