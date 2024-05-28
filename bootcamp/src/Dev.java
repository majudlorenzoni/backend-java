import java.util.*;

public class Dev extends Bootcamp {
  private String nomeAluno;
  private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
  private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

  public void inscreverBootcamp(Bootcamp bootcamp){
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
}

  public void progredir() {
    Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
    if(conteudo.isPresent()) {
        this.conteudosConcluidos.add(conteudo.get());
        this.conteudosInscritos.remove(conteudo.get());
    } else {
        System.err.println("Você não está matriculado em nenhum conteúdo!");
    }
  }

  public double calcularTotalXp() {
    Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
    double soma = 0;
    while(iterator.hasNext()){
        double next = iterator.next().calcularXP();
        soma += next;
    }
    return soma;
  }

  public String getNome() {
    return nomeAluno;
}

public void setNome(String nome) {
    this.nomeAluno = nome;
}

public Set<Conteudo> getConteudosInscritos() {
    return conteudosInscritos;
}

public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
    this.conteudosInscritos = conteudosInscritos;
}

public Set<Conteudo> getConteudosConcluidos() {
    return conteudosConcluidos;
}

public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
    this.conteudosConcluidos = conteudosConcluidos;
}


}