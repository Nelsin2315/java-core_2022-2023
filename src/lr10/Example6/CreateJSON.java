package lr10.Example6;

import lr10.Exampl5.AddCar;
import lr10.Exampl5.Search;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.util.Scanner;

public class CreateJSON {
    public static void main(String[] args) {
        JSONObject cars = new JSONObject();
        JSONArray avto = new JSONArray();

        JSONObject avto1 = new JSONObject();
        avto1.put("Stamp", "Toyota");
        avto1.put("Model", "Camri 70");
        avto1.put("Year", "2018");

        JSONObject avto2 = new JSONObject();
        avto2.put("Stamp", "Opel");
        avto2.put("Model", "Astra J");
        avto2.put("Year", "2013");

        avto.add(avto1);
        avto.add(avto2);

        cars.put("avto", avto);


        try (FileWriter file = new FileWriter("src/lr10/Example6/Example-JSON,json")) {
            file.write(cars.toJSONString());
            System.out.println("JSON файл успешно создан");

            Scanner in = new Scanner(System.in);

            while (true) {
                System.out.println("___________________________________\n");
                System.out.println("Выберите действие: ");
                System.out.println("1 - Добавить марку автомобиля");
                System.out.println("2 - Удалить марку автомобиля");
                System.out.println("3 - Поиск по марке автомобиля");
                System.out.println("4 - Вывести список автомобилей");
                ;
                System.out.println("0 - Выход");
                System.out.println("___________________________________\n");
                System.out.print("Действие?: ");

                int s1 = in.nextInt();
                in.nextLine();

                switch (s1) {
                    case 1:
                        AddJSON.addcarjson();
                        break;
                    case 2:
                        Delete.delcar();
                        break;
                    case 3:
                        Search.searchcar();
                        break;
                    case 4:
                        ReadJSON.readcar();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Н" + "Не правильно выбран вариант");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
