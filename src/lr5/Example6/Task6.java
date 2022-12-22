package lr5.Example6;

public class Task6 {

    private int min;
    private int max;

    public Task6() {

    }

    public Task6 (int a) {
        max = min = a;
    }


    public Task6 (int a, int b) {
        max = a;
        min = b;
    }

    public void Check(int a) {
        min = max = a;
    }

    public void Check(int a, int b) {
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
    }

    public void printMax(){
        System.out.println("max = " + max);
    }
    public void printMin(){
        System.out.println("min = " + min);
    }
}
