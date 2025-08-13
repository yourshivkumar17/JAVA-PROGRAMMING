public class Calculator {
    public void addNumbers() {
        int num1 = 10;
        int num2 = 20;
        int sum = num1+num2;
        System.out.println("Sum: "+ sum);
    }
    public static void main(String[] args) {
        Calculator sc = new Calculator();
        sc.addNumbers();
    }
}
