import java.util.Scanner;

public class Confidence extends Database
{
    private Scanner keyboard = new Scanner(System.in);
    public String[] correct = new String[makeArray().length];
    public String search = ""; //input for the phrase
    public String answer = ""; // input for satisfied
    public StringBuilder stringBuilder = new StringBuilder();
    public void makeConfidence()
    {
        for(int i = 0; i < arrayDatabase.length; i++)
        {
            System.out.println(arrayDatabase[i]);
            System.out.println("Is this result correct? Enter 'y' for yes, or 'n' for no.");
            search = keyboard.nextLine().toUpperCase();

            if (search.equals("Y"))
            {
                correct[i] = arrayDatabase[i];
                System.out.println("Are you satisfied with this result? Enter 'y' for yes, or 'n' for no.");
                answer = keyboard.nextLine().toUpperCase();

                if(answer.equals("Y"))
                {
                    for(int j = 0; j < correct.length; j++)
                    {
                        if(correct[j] != null)
                        {
                            stringBuilder.append(correct[j] + " ");
                        }
                    }
                    i = arrayDatabase.length;
                }
            }
        }
        System.out.println(stringBuilder);
    }

    public String add2Database()
    {
        return stringBuilder.toString();
    }
}
