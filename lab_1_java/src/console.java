/*

 * Name: Smit Patel
 * Title: Java lab 1
 * Student ID: 100846414

 */


import javax.xml.namespace.QName;
import java.util.Scanner;

public class console
{
    private console()
    {
        toply = 3;
        togam = 2;
        console = new Scanner(System.in);
    }

    private static console ins;

    public static console Instance()
    {
        
        if(ins == null)
        
        {
        
            ins = new console();
        
        }
        
        return ins;
    }

    public final int toply;
    public final int togam;

    private Scanner console;

    public <T> T getConsoleInputToArray(String prompt, T[] object)
    {
        System.out.print(prompt);

        switch (object.getClass().getSimpleName())
        {
            case "Double[]":
                return (T) ((Double)console.nextDouble());
            case "Integer[]":
                return (T) ((Integer)console.nextInt());
            case "Float[]":
                return (T) ((Float)console.nextFloat());
            default:
                return (T) console.nextLine();
        }
    }

    public <T> void displayArray(T[] array)
    {
        for (var element: array)
        {
            System.out.println(element);
        }
    }



    public <T> void DisplayReport(T[] array)
    {
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<4; j++)
            {

            }
        }
    }

}