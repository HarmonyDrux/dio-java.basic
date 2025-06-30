package Exercicios;

import java.util.Scanner;

/*Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu 
IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
Se for menor ou igual a 18,5 "Abaixo do peso";
se for entre 18,6 e 24,9 "Peso ideal";
Se for entre 25,0 e 29,9 "Levemente acima do peso";
Se for entre 30,0 e 34,9 "Obesidade Grau I";
Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
 */
public class number2 {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Informe sua altura");
    var altura = scanner.nextFloat();
    System.out.println("Informe o seu peso");
    var peso = scanner.nextFloat();
    var IMC = peso / (altura * altura);

    if (IMC <= 18.5) {
      System.out.printf("O seu IMC é igual a %s.Você está abaixo do peso \n", IMC);

    } else if (IMC >= 18.6 && IMC <= 24.9) {
      System.out.printf("O seu IMC é igual a %s.Você está no peso ideal \\o/ \n", IMC);

    } else if (IMC >= 25 && IMC <= 29.9) {
      System.out.printf("O seu IMC é igual a %s.Você está um pouco acima do peso\n", IMC);

    } else if (IMC >= 30 && IMC <= 34.9) {
      System.out.printf("O seu IMC é igual a %s.Você na obesidade de grau 1\n", IMC);

    } else if (IMC >= 35 && IMC <= 39.9) {
      System.out.printf("O seu IMC é igual a %s.Você na obesidade de grau 2\n", IMC);

    } else if (IMC >= 40) {
      System.out.printf("O seu IMC é igual a %s.A sua obesidade é de grau 3, cuidado pois é morbida\n", IMC);

    } else {

    }
    System.out.printf("Fim da execução");
  }
}
