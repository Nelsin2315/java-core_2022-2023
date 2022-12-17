package lr4;

import java.util.Arrays;
import java.util.Random;

public class Example6 {
    public static void main(String[] args) {

        Random rand = new Random();
        int nryd = 5;
        int nstr = 5;
        int ryd ;
        int str ;

        int[][] array = new int[nryd][nstr];
        for (ryd = 0 ; ryd < nryd; ryd++) {
            for (str = 0; str < nstr; str++) {
                array[ryd][str] = rand.nextInt(nstr * 2);
            }
            System.out.println(Arrays.toString(array[ryd]) + " Количество символов в строке: " + str + ", Столбец : " + (ryd+1));
        }

        System.out.println("-----------------------------------------------");

        int delryd = rand.nextInt(nryd--);
        int delstr = rand.nextInt(nstr--);

        System.out.println("Удалено: строка = " + (delryd + 1) + ", столбец = " + (delstr+1));

        System.out.println(" -----------------------------------------------");

        int[][] secondArray = new int[nryd][nstr];
        int clm = 0;
        for (ryd = 0; ryd < nryd; ryd++) {
            if (ryd == delryd) {
                clm++;
            }
            for (str = 0; str < nstr ; str++) {
                if (str >= delstr) {
                    secondArray[ryd][str] = array[ryd + clm][str + 1];
                    continue;
                }
                secondArray[ryd][str] = array[ryd + clm][str];
            }
            System.out.println(Arrays.toString(secondArray[ryd]) + " Количество символов в строке: " + str + ", Столбец : " + (ryd+1));
        }
    }
}
