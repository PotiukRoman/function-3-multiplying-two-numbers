class Kata {
    static int multiply(int num1, int num2) {
        // your code goes here
        return num1*num2;
    }
}

public class Function3MultiplyingTwoNumbersDemo {
    public static void main(String[] args) {
        Kata K = new Kata();
        // Testing
        System.out.println(K.multiply(2,2));
        System.out.println(K.multiply(5,2));
        System.out.println(K.multiply(100,1));
        System.out.println(K.multiply(0,1000));
    }
}
