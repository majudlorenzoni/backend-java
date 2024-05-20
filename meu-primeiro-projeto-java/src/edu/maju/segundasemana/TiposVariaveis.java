package edu.maju.segundasemana;

public class TiposVariaveis {
public static void main(String[] args) throws Exception{
    // Declaração de variáveis
    int idade = 20;
    double altura = 1.80;
    char sexo = 'M';
    boolean casado = false;
    String nome = "João";
    
    // Cast
    short numero = 10;
    int numero2 = 20;
    short numero3 = (short) (numero + numero2);

    // Constantes
    final double PI = 3.1415;

    // Exibindo os valores das variáveis
    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura);
    System.out.println("Sexo: " + sexo);
    System.out.println("Casado: " + casado);
    System.out.println("Nome: " + nome);
    System.out.println("Número: " + numero3);
    System.out.println("PI: " + PI);
  }	
}