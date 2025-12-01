import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> given = new HashSet<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            given.add(sc.nextInt());
        }
        HashSet<Integer> miss = new HashSet<>();
        for(int i=0;i<=10;i++){
            miss.add(i);
        }
        miss.remove(given);
        System.out.println(miss);
    }
}
