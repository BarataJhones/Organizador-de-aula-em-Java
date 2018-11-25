package organizadoraula.OrganizadorAula;

import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {
    
    private static List<Professor> listaProfessor;

    public ProfessorDAO() {
    }
    
    public void salvar(Professor novoProf) {
        if(listaProfessor == null) {
            listaProfessor = new ArrayList<>();
        }
        listaProfessor.add(novoProf);
    }
    
    public List<Professor> list() {
        return listaProfessor;
    }
    
    public void remover(int index) {
        listaProfessor.remove(index);
    }   
}
