import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        // to read input from user
        Scanner sc=new Scanner(System.in);
        //to store user name
        String username;
        //reading and storing user name
        username=sc.nextLine();
        //displaying user name with hello
        // to display value of variable use variable name
        System.out.println("Hello,"+ username);


    }
}
