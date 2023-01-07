package lr3;

public class Example8 {
    public static void main(String[] args) {
        int count = 10;
        char [] array = new char[count];
        char i = 'A';

        char [] arrayglass= {'A', 'E', 'I', 'O', 'U', 'Y'};

        for (int x = 0; x < array.length; i++) {
            for (int y = 0; y < arrayglass.length; y++)
            {
                if (i == arrayglass[y]) {
                    i++;
                }
            }
            array[x] = i;
            System.out.printf(array[x]+ ",");
            x++;
        }
    }
}
