
package Lisen1;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public String getUserInput(String prompt) throws IOException {
        String inputLine = null;
        System.out.print(prompt + "");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;

        } catch (IIOException e) {
            System.out.println("IIOException " + e);
        }
        return inputLine;
    }
}
