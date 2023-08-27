public class Testtrycatch {
    public static void main(String[] args) {
        try {
            int data = 30/0;
        } catch (ArithmeticException e) {
            // TODO: handle exception
        }
        System.out.println("rest of the code...");
    }
    
}
