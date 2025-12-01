import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<5;i++) {
            set.add(sc.nextInt());
        }
        for(int x: set){
            System.out.print(x+" ");
        }
    }
}
