public class HW_1_2 {
    public static void main(String[] args) {
        System.out.println(factorial(6));

    }
    private static int factorial(int n) {
        if(n==1) {
            return 1;
        }
        return n * factorial(n-1);
    }
        
}
