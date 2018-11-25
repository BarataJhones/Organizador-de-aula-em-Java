package organizadoraula.OrganizadorAula;

import java.util.ArrayList;

public class Professor {
    
    private String nome;
    private String disciplina;
    private String turma;
    private String aulasSemana;
    private ArrayList<String> horariosDisponiveis = new ArrayList<>();
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String Disciplina) {
        this.disciplina = Disciplina;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String Turma) {
        this.turma = Turma;
    }

    public String getAulasSemana() {
        return aulasSemana;
    }

    public void setAulasSemana(String AulasSemana) {
        this.aulasSemana = AulasSemana;
    }

    public ArrayList getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    public void setHorariosDisponiveis(ArrayList horariosDisponiveis) {
        this.horariosDisponiveis = horariosDisponiveis;
    }
 
    
    @Override
    public String toString() {
        return this.nome+" - "+disciplina+" - "+aulasSemana;
    }
    
}
