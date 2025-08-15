public class SimpleInterest {
    public void calculateInterest() {
        double principal = 1000;
        double time = 2;
        double rate = 5;
        double interest = (principal * time * rate) / 100;
        System.out.println(interest);
    }
    public static void main(String[] args) {
        SimpleInterest sc = new SimpleInterest();
        sc.calculateInterest();
    }
}
