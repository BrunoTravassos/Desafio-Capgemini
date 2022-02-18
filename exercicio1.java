// Questão 1:
// Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
//A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

import java.util.Scanner;

class Exercicio1 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int N;
    
    System.out.println("Digite o valor de N ?"); 
    N = myObj.nextInt();   
      for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= N - i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < i; k++)
            System.out.print("*");

        System.out.println();

    } 
  }
}
