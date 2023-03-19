package lr10.Example6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Delete {
    public static void delcar () {
        Scanner in = new Scanner(System.in);
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser
                    .parse(new FileReader("src/lr10/Example2/Example-JSON,json"));
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
        JSONObject library =  (JSONObject) obj;
        JSONArray avto1 = (JSONArray) library.get("avto");
        System.out.println("Введите наименованеи марки автомобиля: ");
        String stamp = in.nextLine();
        Iterator iterator = avto1.iterator();
        while (iterator.hasNext()) {
            JSONObject avto2 = (JSONObject) iterator.next();
            if (stamp.equals(avto2.get("Stamp"))) {
                iterator.remove();
            }
        }
        try(FileWriter file = new FileWriter("src/lr10/Example2/Example-JSON,json"))
        {
            file.write(library.toJSONString());
            System.out.println("Марка "+stamp+" удалена.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
