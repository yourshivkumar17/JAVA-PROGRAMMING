import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int key = sc.nextInt();
        boolean found = false;
        for(int i=0;i<n;i++) {
            if(list.get(i)==key) {
                System.out.println("Found"+i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Not found");
        }
    }
}
