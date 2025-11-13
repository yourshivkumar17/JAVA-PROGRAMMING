import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toString(num);     
        if (num == Integer.parseInt(str)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
