package organizadoraula.OrganizadorAula;

import java.util.ArrayList;
import java.util.List;

public class TabelasDAO {
    
    private static ArrayList<HorariosSalvos> dadosTabela = new ArrayList<>();

    public TabelasDAO() {//inicializando construct
    
    }
    
    public void save(HorariosSalvos novaTabela) {
        if(dadosTabela == null) {
            dadosTabela = new ArrayList<>();
        }
        dadosTabela.add(novaTabela);
    }
    
    public List<HorariosSalvos> list() {
        return dadosTabela;
    }
}
