package lr9.Example1.Example8;

public class Example8 {
    public static int m () {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }
}
