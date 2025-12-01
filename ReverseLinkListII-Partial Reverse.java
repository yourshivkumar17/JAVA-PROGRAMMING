import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        int left=sc.nextInt();
        int right=sc.nextInt();
        Collections.reverse(list.subList(left-1,right));
        System.out.println(list);
    }
}
