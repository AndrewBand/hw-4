package module4.hw4;

public class FirNum {
    public int calc(int n){
        return n;
    }
}
class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            count += i;
        }
        return count;
    }
}

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            count *= i;
        }
        return count;
    }
}

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        if(n==0) return 0;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                count *= i;
            }
        }
        return count;    }
}
class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        int count = 0;
        String iIS = "";
        for (int i = 1; i <= n; i++) {

            if((i%3==0 || i%5==0)&& !(i%3==0 & i%5==0)){
                iIS += Integer.toString(i);
                count += i;

            }
        }
        return count;
    }
    public void calc2(int n) {
        int count = 0;
        String iIS = "";
        for (int i = 1; i <= n; i++) {
            if(i%3==0 | i%5==0){
                iIS += ", " + i;
                count += i;

            }
        }
        System.out.println( "inn n = " + n + " iIS = " + iIS);
        //return count;
    }
}
class FirNumBasis extends FirNum{
    @Override
    public int calc(int n) {
        int count = 0;
        String iIS = "";
        for (int i = 1; i <= n; i++) {

            if(i%2==0){
                count += i;

            }
        }
        return count/2;
    }
}

class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();

        //Should be 10
        System.out.println(firTest.test(firNum, 4));
        FirNum firNumSum = new FirNumSum();

        System.out.println("new FirNumSum().calc(3) = " + new FirNumSum().calc(3));
        System.out.println("new FirNumFactorial().calc(4) = " + new FirNumFactorial().calc(4));
        System.out.println("new FirNumMultiplyOdd().calc(5) = " + new FirNumMultiplyOdd().calc(-4));
        System.out.println("new FirNumFizzBuzz().calc(20) = " + new FirNumFizzBuzz().calc(20));
        new FirNumFizzBuzz().calc2(20);
        System.out.println("new FirNumBasis().calc(9) = " + new FirNumBasis().calc(9));
    }
}
