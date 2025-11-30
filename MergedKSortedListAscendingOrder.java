import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();

        System.out.print("Enter number of elements in list1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter " + n1 + " sorted elements for list1:");
        for (int i = 0; i < n1; i++) {
            list1.add(sc.nextInt());
        }

       
        System.out.print("Enter number of elements in list2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter " + n2 + " sorted elements for list2:");
        for (int i = 0; i < n2; i++) {
            list2.add(sc.nextInt());
        }

       
        System.out.print("Enter number of elements in list3: ");
        int n3 = sc.nextInt();
        System.out.println("Enter " + n3 + " sorted elements for list3:");
        for (int i = 0; i < n3; i++) {
            list3.add(sc.nextInt());
        }

       
        LinkedList<Integer> merged = new LinkedList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        merged.addAll(list3);

        
        Collections.sort(merged);  

       
        System.out.println("Merged Sorted List in Ascending Order: " + merged);

        sc.close();
    }
}
