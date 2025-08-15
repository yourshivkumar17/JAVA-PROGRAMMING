public class Greeting {
    public void  sayHello(String name) {
        System.out.print("Hello,"+name+ "! Welcome to Java Proramming");
    }
    public static void main(String[] args) {
        Greeting sc = new Greeting();
        sc.sayHello("Shiv");
    }
}
