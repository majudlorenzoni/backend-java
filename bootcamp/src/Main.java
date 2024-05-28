public class Main {

  public static void main(String[] args) {
    Curso curso = new Curso();
    curso.setTitulo("Java Basics");
    curso.setDescricao("Curso introdutório de Java");
    curso.setCargaHoraria(40); // Definindo a carga horária do curso

    // Calculando a XP do curso
    double xp = curso.calcularXP();

    // Exibindo informações sobre o curso
    System.out.println("Informações do curso:");
    System.out.println(curso);
    System.out.println("XP do curso: " + xp);
    
    Dev dev = new Dev();
    dev.setNome("Alice");

    // Criando um objeto Bootcamp
    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp de Java");
    bootcamp.setDescricao("Bootcamp avançado de Java");

    // Inscrevendo o Dev no Bootcamp
    dev.inscreverBootcamp(bootcamp);

    // Progresso no Bootcamp
    dev.progredir();

    // Calculando XP total
    double xpTotal = dev.calcularTotalXp();

    // Exibindo informações sobre o Dev e XP total
    System.out.println("Dev: " + dev.getNome());
    System.out.println("XP Total: " + xpTotal);
  }

}
