/**
 *Test for methods, this program figures out if the gven number is a niven number or not using a method
 * @author Zachary Balean
 */
public class Main {

  //method to determine niven number
  public static boolean isNiven(int number){
    //integer for sum of digits
    int digitSum = 0;
    //integer to add digits together
    int remainder = 0;
    //comparer
    int originalNum = number;
    //while loop to calculate sum of digits
    while(number >= 1){
      //calculates one digits
      remainder = number % 10;
      //divides number by ten to move on to next digit
      number = number / 10;
      //adds digit to sum variable
      digitSum = digitSum + remainder;
    }

    //if statment to determine if the number is niven
    if(originalNum % digitSum == 0){
      return true;
    //if false
    }else{
      return false;
    }
  }




  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // calls method
    boolean answer = isNiven(18);
    //prints answer
    System.out.println(answer);
  }
}
