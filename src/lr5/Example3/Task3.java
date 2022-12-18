package lr5.Example3;

public class Task3 {
    // классом, у которого есть два целочисленных поля.
    private int int1;
    private int int2;

    //конструктор, позволяющий создавать объекты без передачи аргументов
    public Task3(){
        System.out.println("Конструктор без передачи аргументов");
    }

    //конструктор, позволяющий создавать объекты с передачей одного аргумента
    public Task3(int i1){
        System.out.println("Конструктор с передачей одного аргумента");
        this.int1 = i1;
        System.out.println("Первый аргумент: " + i1);
    }


    //конструктор, позволяющий создавать объекты с передачей двух аргументов
    public Task3(int in1, int in2){
        System.out.println("Констурктор с передачей 2-х аргументов");
        this.int1 = in1;
        this.int2 = in2;
        System.out.println("Первый аргумент: " + in1 + " Второй аргумент: " + in2);
    }
}
