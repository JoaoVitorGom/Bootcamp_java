package joao.edu.primeirasemana;
import java.util.Scanner;

public class BoletimEscolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           System.out.println("Qual foi sua média final?");
           int mediaFinal= input.nextInt();
           if (mediaFinal<6)
              System.out.println("Reprovado");
           else if(mediaFinal==6)
              System.out.println("Prova Minerva");
           else
              System.out.println("Aprovado");
    }

}
