public class Turma {
    private String nome;
    private String curso;
    private int quantidadeDeAlunos;
    private int serie;

    public Turma (String nome, String curso, int quantidadeDeAlunos, int serie) {
        this.nome = nome;
        this.curso = curso;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public int getSerie() {
        return serie;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setCurso(String c) {
        curso = c;
    }

    public void setQuantidadeDeAlunos(int q) {
        quantidadeDeAlunos = q;
    }

    public void setSerie(int s) {
        serie = s;
    }
}