import java.util.ArrayList;
import java.util.List;
// Questão 2:
// Construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.


import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

       String senha="";
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite Senhar :");
       senha = sc.next();
                 
       if (senha.length() < 6){
           int sum = 6 - senha.length();
           System.out.print(sum);
       }
      
    }
}
