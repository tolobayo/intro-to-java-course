package com.cbfacademy;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConnectToUrl {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        try {
            URL url = new URL("https://codingblackfemales.com");

            //open stream to read the content
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            //read first line
            String line = reader.readLine();

            while (line != null) {
                //print line
                System.out.println(line);
                //move to next line
                line = reader.readLine();
            }
            
            //close reader
            reader.close();
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        
    }
    
}
