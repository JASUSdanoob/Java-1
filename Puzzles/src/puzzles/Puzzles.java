
package puzzles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Puzzles {

    public static void main(String[] args) {
        String FILENAME = "puzzle.txt";
	try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            int count=1;
            while (currentLine != null) {
                if (count % 3==0) {
                    System.out.println(currentLine);
                }
                count++;
		
                currentLine = reader.readLine();
            }

	}
        catch (IOException e) {
            e.printStackTrace();
	}
    }
    
}

