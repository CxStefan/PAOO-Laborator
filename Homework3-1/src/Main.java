import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class Main{

    public static void main(String[] args) {
        LinearEquation eq = new LinearEquation(2,-4);
        LinearSolver solver = new LinearSolver();
        LinearSolver result = solver.solve(eq);

        Gson gson = new Gson();
        String json =gson.toJson(result);

        try(FileWriter fw = new FileWriter("src/solution.json")){
            fw.write(json);
            System.out.println("Solution has been saved!");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
