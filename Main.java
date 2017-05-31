import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Database data = new Database();
        Confidence confidence = new Confidence();
        UserInput userInput = new UserInput();
        userInput.userInput();
        data.makeArray();
        confidence.makeConfidence();
        HashMap<String, String> map = new HashMap<String, String>();
        map.put(userInput.quote, confidence.add2Database());
        System.out.println("The search " + userInput.quote + " and the result " + confidence.add2Database() + " are now related in the Database");

        Scanner quote = new Scanner(System.in);
        System.out.println("Enter the value you are looking for in the Database:");
        String newInput = quote.nextLine();
        System.out.println(map.get(newInput));
    }
}
