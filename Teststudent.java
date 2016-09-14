import java.util.Scanner;

public class TestStudent{

public static void main(String[] args) {
Scanner input = new Scanner (System.in);

System.out.println("Enter your name: ");

String name = input.next();

System.out.println("Your name is " + name);

  System.out.println("What year did you graduate?");
  
  int graduationYear = input.nextInt();
  
  System.out.println("Year of graduation: " + graduationYear);
  
  
}
}

