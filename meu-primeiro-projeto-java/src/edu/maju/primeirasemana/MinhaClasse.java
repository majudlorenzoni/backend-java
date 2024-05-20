package edu.maju.primeirasemana;
public class MinhaClasse {
  public static void main(String[] args) {
    
    // Tipo NomeDaVariavel = Valor;
    int numero = 10;
    double numeroDecimal = 10.5;
    int anoFabricacao = 2020;
    boolean estaLigado = true;
    String nome = "Maria";
    String sobrenome = "Lorenzoni";
    
    String nomeCompleto = nomeCompleto(nome, sobrenome);
    System.out.println(nomeCompleto);
  }
  
  public static String nomeCompleto (String nome, String sobrenome) {
  return nome.concat(" ").concat(sobrenome);
  } 
}

