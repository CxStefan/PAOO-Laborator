import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumFile {

    public static int sumIntegersFromFile(String filename) {
        int sum = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){

            String line = reader.readLine();
            while(line != null){
                try{
                    int number = Integer.parseInt(line.trim());
                    sum += number;
                }catch(NumberFormatException e){
                    System.out.println("Error in reading file");
                }
                line = reader.readLine();
            }
        }catch(IOException e)
        {
            System.out.println("File not found");
        }
        return sum;
    }

    public static void main(String[] args) {
        String filename = "resources/date.txt";
        int result = sumIntegersFromFile(filename);
        System.out.println(result);
    }
}
