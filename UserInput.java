import java.util.Scanner;

public class UserInput
{
    private Scanner input = new Scanner(System.in);
    public String quote;

    public void userInput()
    {
        input = new Scanner(System.in);
        System.out.println("Enter a quote");
        quote = input.nextLine();

        System.out.println("Your quote is: " + quote);
        System.out.println("We will try our best to find a movie that matches.");
    }
}
