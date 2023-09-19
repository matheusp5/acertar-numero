import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Pressione 'enter' para iniciar o jogo");
        scanner.nextLine();

        int number = random.nextInt(100);

        System.out.println();

        while(true) {
            System.out.print("Seu chute: ");
            int think = scanner.nextInt();
            if(think > 0 && think < 100) {
                if(think > number) {
                    System.out.println("Você está chutando alto!");
                } else if (think < number){
                    System.out.println("Você está chutando baixo!");
                } else {
                    System.out.println("Obaaaa! Você ganhou.");
                    break;
                }
            }
        }
    }
}