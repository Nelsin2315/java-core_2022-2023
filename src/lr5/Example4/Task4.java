package lr5.Example4;

public class Task4 {

    private char ch1;
    private int int1;

    Task4 (int i, char j) {
        this.ch1 = j;
        this.int1 = i;
        int len = (int) (Math.log10(int1) + 1);
        double res = (double) ch1 + (double) int1 * 1 / Math.pow(10, len);
        System.out.println("Число: " + res + ", целочисленное число (длинна)" + len + ", код символа: " + (double) ch1);
    }

    Task4 (double db) {
        char ch1 = (char) db;
        int1 = (int) ((db - (int) db) * 100);
        System.out.println("Символ: " + ch1 + ", Целочисленное поле (остаток): " + int1 + "\n");

    }
}
