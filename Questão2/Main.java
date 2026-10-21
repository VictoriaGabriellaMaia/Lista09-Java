public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 101, "Sistemas de Informação");
        Aluno aluno2 = new Aluno("Maria", 102, "Administração");

        aluno1.exibirDados();

        System.out.println();

        aluno2.exibirDados();
    }
}
