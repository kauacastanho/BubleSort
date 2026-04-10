import java.util.Comparator;

public class comparadorPorIdade implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2){
        return a1.getIdade().compareTo(a2.getIdade());
    }
}



