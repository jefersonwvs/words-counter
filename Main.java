import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        
        String path = args[0]; 
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            int counter = 0;
            String line = br.readLine();
            while (line != null) {
                String[] words = line.split(" ");
                for(String str : words) {
                    //if (str.matches("[\\w]*[\\W]*[\\w]*")) {
                       //System.out.println(str);
                        counter++;
                    //}
                }    
                line = br.readLine();
            }
            System.out.printf("The file contains %d words!\n", counter);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}