import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Aluno> ps;
        Aluno a1 = new Aluno("Denis", 22, 7.5);
        Aluno a2 = new Aluno("Mariana", 20, 8.2);
        Aluno a3 = new Aluno("Carlos", 23, 6.9);
        Aluno a4 = new Aluno("Fernanda", 21, 9.1);
        Aluno a5 = new Aluno("Lucas", 19, 7.8);
        Aluno a6 = new Aluno("Juliana", 22, 8.5);
        Aluno a7 = new Aluno("Rafael", 24, 6.5);
        Aluno a8 = new Aluno("Patricia", 20, 9.3);
        Aluno a9 = new Aluno("Bruno", 23, 7.0);
        Aluno a10 = new Aluno("Camila", 21, 8.7);

        ps = new ArrayList<>();
        ps.add(a1);
        ps.add(a2);
        ps.add(a3);
        ps.add(a4);
        ps.add(a5);
        ps.add(a6);
        ps.add(a7);
        ps.add(a8);
        ps.add(a9);
        ps.add(a10);
        System.out.println("");
        System.out.println("Ordem Padrão");
        System.out.println("--------------------------------------");
        System.out.println(String.format("%-15s | %5s | %10s |", "Nome", "Idade", "Nota Final"));
        for (Aluno aluno : ps) {
            System.out.println(aluno);
        }
        System.out.println("--------------------------------------");
        System.out.println("");


        System.out.println("Ordenando por Nota Final");
        System.out.println("--------------------------------------");
        System.out.println(String.format("%-15s | %5s | %10s |", "Nome", "Idade", "Nota Final"));
        ArrayList<Aluno> por_nota = new ArrayList<>();
        por_nota.addAll(ps);

        Collections.sort(por_nota);
        
        for (Aluno aluno : por_nota) {
            System.out.println(aluno);
        }
        System.out.println("--------------------------------------");
        System.out.println("");


        ComparadorPorNome cpd;
        cpd = new ComparadorPorNome();
        ps.sort(cpd.reversed());
        
        System.out.println("Nome em ordem Reversa");
        System.out.println("--------------------------------------");
        System.out.println(String.format("%-15s | %5s | %10s |", "Nome", "Idade", "Nota Final"));
        for (Aluno aluno : ps) {
            System.out.println(aluno);
        }
        System.out.println("--------------------------------------");
        System.out.println("");

        comparadorPorIdade cpd2;
        cpd2 = new comparadorPorIdade();
        ps.sort(cpd2);
        
        System.out.println("Ordenando por Idade");
        System.out.println("--------------------------------------");
        System.out.println(String.format("%-15s | %5s | %10s |", "Nome", "Idade", "Nota Final"));
        System.out.println("--------------------------------------");
        for (Aluno aluno : ps) {
            System.out.println(aluno);
        }
        System.out.println("--------------------------------------");
    }
}
