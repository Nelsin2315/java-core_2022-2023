package lr10.Example6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AddJSON {
    public static void addcarjson () {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите марку автомобиля:  ");
        String stamp = in.nextLine();

        System.out.println("Введите модель автомобиля: ");
        String model = in.nextLine();

        System.out.println("Введите год производства автомобиля: ");
        String year = in.nextLine();

        JSONParser parser = new JSONParser();
        Object i = null;
        try {
            i = parser
                    .parse(new FileReader("src/lr10/Example6/Example-JSON,json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        JSONObject cars =  (JSONObject) i;
        JSONArray avto = (JSONArray) cars.get("avto");
        JSONObject newcar = new JSONObject();
        newcar.put("Stamp", stamp);
        newcar.put("Model", model);
        newcar.put("Year", year);
        avto.add(newcar);

        cars.put("avto",avto);
        try(FileWriter file = new FileWriter("src/lr10/Example6/Example-JSON,json"))
        {
            file.write(cars.toJSONString());
            System.out.println("Новая марка автомобиля добавлена");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
