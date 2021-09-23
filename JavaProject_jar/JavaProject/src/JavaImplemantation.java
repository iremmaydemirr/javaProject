import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class JavaImplemantation {
    public static void main(String[] args)
            throws IOException
    {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter the text");

        // Reading data using readLine
        String text = reader.readLine();


        System.out.println("Your text:" +text);
    }
}

//Use implementation