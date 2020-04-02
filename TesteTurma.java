import javax.swing.JOptionPane;

public class TesteTurma {
    public static void main (String [] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome da turma: ");
        String curso = JOptionPane.showInputDialog("Digite o nome do curso: ");
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos: "));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a série da turma: "));

        Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);

        String msg = "Nome do curso: " + turma.getCurso() + " \nnome da turma: " + 
                      turma.getNome() + " \nquantidade de alunos " + turma.getQuantidadeDeAlunos() + 
                      " \nSérie da turma: " + turma.getSerie();

        JOptionPane.showMessageDialog(null, msg);

        turma.setNome(nome);
        turma.setCurso(curso);
        turma.setSerie(serie);
        quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos: "));
        turma.setQuantidadeDeAlunos(quantidadeDeAlunos);

        msg = "Nome do curso: " + turma.getCurso() + " \nnome da turma: " + 
                      turma.getNome() + " \nquantidade de alunos " + turma.getQuantidadeDeAlunos() + 
                      " \nSérie da turma: " + turma.getSerie();

        JOptionPane.showMessageDialog(null, msg);
    }
}