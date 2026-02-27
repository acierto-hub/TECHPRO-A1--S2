public class Seatworkten {
    public static void main(String[] args) {
        try {
            int[] x = {1, 2};
            System.out.println(x[5]);  // This will cause an error
        } 
        catch (ArithmeticException e) {
            System.out.println("Math Error");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error");
        }
    }
}
