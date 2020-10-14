package Five;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String URLString;
        String line;
        int count;

        System.out.println("Enter a URL: ");
        URLString = scan.next();

        try{
            URL url = new URL(URLString);
            count = 0;
            scan = new Scanner(url.openStream());
            while(scan.hasNext()) {
                line = scan.nextLine();
                count += line.length();
            }
            System.out.println("File size is " + count + " characters");
        } catch (MalformedURLException e) {
            System.out.println("INVALID URL");
        }
        catch (IOException f) {
            System.out.println("I/O Errors: No such file");
        }
    }
}
