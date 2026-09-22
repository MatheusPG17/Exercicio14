
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int Idadenasc, anoatual, idade;
        System.out.println("Em que ano você está?");
        anoatual = leia.nextInt();
        System.out.println("Que ano você nasceu?");
        Idadenasc = leia.nextInt();
        
        if (Idadenasc >= anoatual){
            System.out.println("Ano inválido.");
        } else {
            idade = anoatual - Idadenasc;
            System.out.println("Idade válida, você tem " + idade + " anos");
        }
    }
}
