package main.set.Pesquisa;
import java.util.Objects;

public class Contato {
  private String nome;
  private String numero;

  public Contato(String nome, String numero) {
    this.nome = nome;
    this.numero = numero;
  }

  public String getNome() {
    return nome;
  }

  public String getNumero() {
    return numero;
  }

  @Override
  public boolean equals(Object o){
    if(this == o) return true;
    if(!(o instanceof Contato contato)) return false;
    return Objects.equals(getNome(), contato.getNome()) && Objects.equals(getNumero(), contato.getNumero()); 
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNome());
  }

  @Override
  public String toString() {
    return "Contato{" +
            "nome: '" + nome + '\'' +
            ", numero: '" + numero + '\'' +
            '}';
  }
}
