package lr6.Example1;

import java.util.Arrays;

public class Task1 {

    char ch1;
    String str1;

    public Task1() {

    }

    public void word (char ch1){
        this.ch1 = ch1;
        System.out.println("Текстовый аргумент: " + this.ch1);
    }


    public void word (String str1){
        this.str1 = str1;
        System.out.println("Текстовый аргумент: " + str1);
    }

    public void word (char [] chars){
        if (chars.length == 1) {
            System.out.print("Символьный аргумент: ");
            System.out.println(chars);
        } else if (chars.length > 1) {
            System.out.print("Текстовый аргумент: ");
            for(int i=0; i<chars.length; i++){
                this.ch1 = chars[i];
                System.out.print(chars[i]);
            }
        }
    }

}
