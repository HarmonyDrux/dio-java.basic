package Exercicios;

import java.util.Scanner;

//Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
public class number1 {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Informe um número");
    var number = scanner.nextInt();
    var i = 1;

    for (i = 1; i <= 10; i++) {
      var tabuada = number * i;
      System.out.println(tabuada);

    }
  }
}