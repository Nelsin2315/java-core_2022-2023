package lr11.Example7;

import java.util.ArrayList;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        ArrayList Array = new ArrayList();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество человек: ");
        int n = in.nextInt();
        long m = System.currentTimeMillis();

        for(int i = 1; i <= n;i++){
            Array.add(i);
        }
        minus(Array);
        for(int i = 0; i < Array.size();i++){
            System.out.println(Array.get(i) + "");
        }

        System.out.println((double) (System.currentTimeMillis() - m)/1000);
    }

    public static ArrayList minus (ArrayList Array){
        if(Array.size() < 2){
            return Array;
        }
        for(int i = 0;i < Array.size();i++){
            if(i+1 < Array.size()) {
                Array.remove(i + 1);
            }
        }

        return minus(Array);
    }
}

