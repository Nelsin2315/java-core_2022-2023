package lr10.Example6;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.Scanner;

public class SearchJSON {
    public static void searchcar () {
        Scanner in = new Scanner(System.in);
        try {
            JSONParser parser = new JSONParser();
            Object i = parser
                    .parse(new FileReader("src/lr10/Example6/Example-JSON,json"));
            JSONObject jsonObject = (JSONObject) i;
            System.out.print("Введите марку автомобиля: ");
            String marka = in.nextLine();

            JSONArray jsonArray = (JSONArray) jsonObject.get("avto");
            for (Object o: jsonArray)
            {
                JSONObject avt = (JSONObject) o;
                jsonArray.stream().filter(avto1 -> avto1 instanceof JSONObject).map(avto1 -> (JSONObject) avt).filter(avto1 -> marka.equals(avt.get("Stamp"))).forEach(avto1->{
                            System.out.print("Марка автомобиля: " + avt.get("Stamp"));
                            System.out.print("\nМодель автомобиля: " + avt.get("Model"));
                            System.out.print("\nГод производства: " + avt.get("Year"));
                        });

            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
