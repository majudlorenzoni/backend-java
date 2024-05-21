package edu.maju.sistemasmarttv;

import java.util.Scanner;

public class Usuario {
  public static void main(String[] args) {
    SmartTV smartTV = new SmartTV();
    int novoCanal = 13;

     Scanner scanner = new Scanner(System.in);
      System.out.println("\n1 - Ligar");
      System.out.println("2 - Desligar");
      System.out.println("3 - Mudar Canal");
      System.out.println("4 - + Canal");
      System.out.println("5 - - Canal");
      System.out.println("6 - Aumentar Volume");
      System.out.println("7 - Diminuir Volume");
      System.out.println("Digite a opção desejada: ");
      int opcao = scanner.nextInt();
    
      switch (opcao) {
      case 1:
      smartTV.ligar();
      break;
      case 2:
      smartTV.desligar();
      break;
      case 3:
      smartTV.mudarCanal(novoCanal);
      break;
      case 4:
      smartTV.maisCanal();
      break;
      case 5:
      smartTV.menosCanal();
      break;
      case 6:
      smartTV.volumeMais();
      break;
      case 7:
      smartTV.volumeMenos();
      break;
      default:
      System.out.println("Opção inválida");
      break;
    }
  }
}
