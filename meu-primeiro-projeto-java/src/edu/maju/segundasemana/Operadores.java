package edu.maju.segundasemana;

public class Operadores {

  public static void main(String[] args) {
    // Operadores Aritméticos 
    String nomeCompleto = "Linguagem " + "Java";

    System.out.println("Nome Completo: " + nomeCompleto);

    String concatenacao = "1" + "1" + "1" + 1 + 2;
    System.out.println("Concatenação: " + concatenacao);

    concatenacao = 1 + 1 + 1 + "1";
    System.out.println("Concatenação: " + concatenacao);

    int numero = 10;

    System.out.println("Número: " + numero);
    System.out.println(- numero);

    int numero1 = 10;
    int numero2 = 20;

    boolean simNao = numero1 == numero2;
    System.out.println("Os numeros são iguais? : " + simNao);

    simNao = numero1 != numero2;

    System.out.println("Os numeros são diferentes? : " + simNao);
  }
  
}
