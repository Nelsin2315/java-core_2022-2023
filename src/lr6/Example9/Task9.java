package lr6.Example9;

public class Task9 {

    public static char[] ch1(char[]charArray){

        for (int i=0;i<charArray.length/2;i++){
            char ch=charArray[i];
            charArray[i]=charArray[charArray.length-1-i];
            charArray[charArray.length-1-i]= ch;

        }
        return charArray;
    }
}
