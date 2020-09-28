package Runner;

public class Runner1 {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 0;

        try {
            System.out.println(val1 / val2);
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на 0");
        }
    }
}
