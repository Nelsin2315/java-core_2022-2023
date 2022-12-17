package lr4;

public class Example1 {
    public static void main(String[] args) {
        int figure = 11;
        int i;
        int j;
        int z;
        System.out.println("Формирование фигуры:");

        for (i=1; i <= figure; i++) {
            System.out.println("");
            z=0;
            for (j = - 12; j<figure; j++) {
                System.out.print("+");
                z=z+1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }
}

