import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calculator = new CalculationExample();
        calculator.calculator(x,y);
    }
    private void calculator(int x, int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y là: " + a);
            System.out.println("Hiệu x - y là: " + b);
            System.out.println("Tích x * y là: " + c);
            System.out.println("Thương x / y là: " + d);
        }
        catch (Exception e)
        {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
