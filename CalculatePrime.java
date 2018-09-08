import java.util.*;

/*
* Xhanti Singatha
* 09 September 2018
*/

public class CalculatePrime {

       public int checkPrime(int value){
              int counter = 0;
              for (int i = 0; i < value; i++){
                  if ((value % (i+1)) == 0){
                     counter++;
                  }
              }
              
              return counter;
       }
       
       public static void main(String [] args){
              Scanner console = new Scanner(System.in);
              CalculatePrime prime = new CalculatePrime();
              
              String num = console.nextLine();
              
              try {
                  int number = Integer.parseInt(num);
                  if (number > 0 && number <=9999){
                      int a = prime.checkPrime(number);
                      System.out.println("Input: "+number);
                      if (a == 2){
                         System.out.println("Output: True");
                      }
                      
                      else {
                         System.out.println("Output: False");
                      }
                  }
                  
                  else {
                      System.out.println("Input: "+number);
                      System.out.println("Output: Enter a number that has less than 4 digits");
                  }
              }
              
              catch (NumberFormatException ne) {
                  System.out.println("Input: \""+num+"\"");
                  System.out.println("Output: \"Only Numbers maybe entered\"");
              }


       }
}