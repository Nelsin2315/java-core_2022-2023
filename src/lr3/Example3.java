package lr3;

public class Example3 {

    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int result;
        int count = 2;

        System.out.println("For:");
        System.out.print(a+" "+b+" ");

        for(int i = 3; i <= 11; i++){
            result=a+b;
            System.out.print(result+" ");
            a=b;
            b=result;
        }
        System.out.println(" ");
        System.out.println("While:");

        System.out.print(c+" "+d+" ");
        while (count < 11) {
            result=c+d;
            System.out.print(result+" ");
            c=d;
            d=result;
            count ++;
        }

    }
}
