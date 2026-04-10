/**
 * Classe aluno
 * @author Kauã Castanho
 * @version 1.0
 */
public class Aluno implements Comparable<Aluno>{
    private String nome;
    private Integer idade;
    private Double notaFinal;

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Aluno(String n, Integer i, Double nf){
        this.nome=n;
        this.idade=i;
        this.notaFinal=nf;
    }
    @Override
    public int compareTo(Aluno a1){
        return Double.compare(this.notaFinal, a1.notaFinal);
    }

    @Override
    public String toString(){
        return String.format("%-15s | %5d | %10.2f |",this.nome, this.idade, this.notaFinal);
    }

}
