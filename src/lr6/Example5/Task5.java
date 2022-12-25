package lr6.Example5;

public class Task5 {
     public static int getFactorialRec(int n) {
            int res =0;
            if (n <= 1) return 1;
            res += getFactorialRec(n-1)+n*n;
            return res;
        }

        public static int getFactorialFor(int n){
            int res=0;
            int j = n;
            int s = 2;
            for(int i=n; i>0;i--){
                res = (int)Math.pow(j,s) + res;
                j--;
            }
            return res;
        }
    }