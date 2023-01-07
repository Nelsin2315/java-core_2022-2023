package lr7.Example3;

public class subSubClassTeset extends subClassTest {
    public String str2;

    public subSubClassTeset(int int2,char chnum1,String strnum2) {
        super(int2,chnum1);
        this.str2=strnum2;

    }

    @Override
    public String toString() {
        return "subSubClassTeset" +
                "str1: " + ch1 + '\'' +
                ",str2: '" + str2 + '\'' +
                ",int1:" + int1;
    }

    }
