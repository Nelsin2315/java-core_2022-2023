package lr6.Example3;

public class Task3 {

    public static int arraymax(int... chislo) {
        int max = chislo[0];
        for (int i = 0; i < chislo.length; i++) {
            max = Math.max(max, chislo[i]);
        }
        return max;
    }

    public static int arraymin(int... chislo) {
        int min = chislo[0];
        for (int i = 0; i < chislo.length; i++) {
            min = Math.min(min, chislo[i]);
        }
        return min;
    }

    public static int aver(int... chislo) {
        int sum = 0;
        for (int i = 0; i < chislo.length; i++) {
            sum = sum + chislo[i];
        }
        int aver = sum / chislo.length;
        return aver;
    }
}
