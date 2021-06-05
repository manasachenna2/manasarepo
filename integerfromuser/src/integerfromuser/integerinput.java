package integerfromuser;
import java .util.Scanner;

public class integerinput {

	public static void main(String[] args) {
   Scanner input =new Scanner(System.in);
   System.out.println("Enter an integer :");
   int number=input .nextInt();
   System.out.println("you entered"+number);
   
   //closing the scanner object 
   input.close();
	
	}

}
