package javaapplication7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class JavaApplication7 { 

    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("url"); // with GET data
        URLConnection connection = url.openConnection();
        connection.connect();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;

        while((inputLine = in.readLine()) != null)
        {
            System.out.println(inputLine);
        }

in.close();
        
    }
}
