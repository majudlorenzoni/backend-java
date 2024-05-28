import java.time.LocalDate;

public class Mentorias extends Conteudo{
  private LocalDate dataMentoria;

  @Override
  public double calcularXP(){
    return XP_PADRAO +20d;
  }

  public Mentorias(){
  }

  public LocalDate getDataMentoria() {
    return dataMentoria;
  }

  public void setDataMentoria(LocalDate dataMentoria) {
    this.dataMentoria = dataMentoria;
  }

  @Override
  public String toString() {
      return "Mentoria{" +
              "titulo='" + getTitulo() + '\'' +
              ", descricao='" + getDescricao() + '\'' +
              ", data=" + dataMentoria +
              '}';
  }

}


