import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Move = sc.nextLine(); //for String nextLine is L capital
        switch(Move) {
            case "Rock":
            System.out.println("Paper");
            break;
            case "Paper":
            System.out.println("Scissors");
            break;
            case "Scissors":
            System.out.println("Rock");
            break;
            default:
            System.out.println("Invalid move"); 
        }
        sc.close();

    }
}