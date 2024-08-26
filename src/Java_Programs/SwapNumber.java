package Java_Programs;

//Swap Number

public class SwapNumber {
    public static void main(String[] args) {
        int a=50;
        int b=70;
        System.out.println("Actual a =" +a+"b ="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swapped a =" +a+"b=" + b);
    }
}
