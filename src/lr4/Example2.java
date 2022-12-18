package lr4;

public class Example2 {
    public static void main(String[] args) {
       int figure = 15;
       int i;
       int j;
       int z = 0;

       for (i=1; i <=figure; i++) {
           System.out.print("");

           for (j=0; j<=z; j++) {
               System.out.print("+");
           }
           z=z+1;
           System.out.println(" Количество символов в строке " + z + ", Строка: " + i);
       }
    }
}