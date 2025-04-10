import java.io.*;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Config {
    String color;
    int weight;
    private static Config instance;
    private boolean isLoaded = false;

    public static Config getInstance(){
        if(instance == null){
            instance = new Config();
        }
        return instance;
    }

    private void loadConfig() {
        if (isLoaded) return;

        JSONParser parser = new JSONParser();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.json")) {
            if (input == null) {
                throw new FileNotFoundException("config.json not found in resources folder.");
            }

            InputStreamReader reader = new InputStreamReader(input);
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            this.color = (String) jsonObject.get("color");
            this.weight = ((Long) jsonObject.get("weight")).intValue();
            isLoaded = true;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            this.color = "#000000";
            this.weight = 0;
        }
    }


    public Config(){}

    public String getColor(){
        if(!isLoaded){
            loadConfig();
        }
        return color;
    }
    public int getWeight(){
        if(!isLoaded){
            loadConfig();
        }
        return weight;
    }
}
