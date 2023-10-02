import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            playTheGame(getUserChoice(scanner), getCompChoice());
        }
    }
    public static int getCompChoice(){
        Random rand = new Random();
        return rand.nextInt(3);
    }
    public static int getUserChoice(Scanner scanner){
        System.out.println("Выбирай:");
        System.out.println("1. Камень");
        System.out.println("2. Ножницы");
        System.out.println("3. Бумага");
        String choice = scanner.nextLine();
        return Integer.parseInt(choice) - 1;
    }
    public static void playTheGame(int userChoice, int compChoice){
        String[] choice = {"Камень", "Ножницы", "Бумага"};
        System.out.println("Ты: " + choice[userChoice] + " Комп: " + choice[compChoice]);
        if (userChoice - compChoice == 1 || userChoice - compChoice == -2){
            System.out.println("Комп выиграл");
        } else if (userChoice - compChoice == -1 || userChoice - compChoice == 2){
            System.out.println("Ты выиграл");
        } else {
            System.out.println("Перекидывайте");
        }
    }
}

