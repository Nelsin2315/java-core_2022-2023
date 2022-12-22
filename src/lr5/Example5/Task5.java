package lr5.Example5;

public class Task5 {
    //закрытое целочисленное поле
    private int i;

    public Task5() {
        this.i = 0;
    }

    public Task5(int value) {
        this.i = value;
    }


    public void printValue(){
        System.out.println("Без аргумента value: " + CheckValue());
    }

    public void printValue(int newValue){
        System.out.println("С аргументом value: " + CheckValue(newValue));
    }

    private int CheckValue() {
        return check(i);
    }
    private int CheckValue(int i2) {
        this.i = i2;
        return check(i);
    }

    private int check (int value){
        if (i==0) {i = 0;
        } else if (i > 100) i= 100;
        return i;
    }
}
