package src.bean;
import src.dao.*;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import src.model.Analista;

@ManagedBean(name="listaBean")
@SessionScoped
public class AnalistaBean {
    
    private Analista analista = new Analista();
    private List<Analista> cadastros = new ArrayList<>();
    private AnalistaDAO anaDAO = new AnalistaDAO();
    
    public void adicionar(){
        cadastros.add(analista);
        anaDAO.inserir(analista);
        analista = new Analista();
    }
    public void alterar(Analista ob){
        analista = ob;
    }

    public Analista getAnalista() {
        return analista;
    }

    public void setAnalista(Analista analista) {
        this.analista = analista;
    }

    public List<Analista> getCadastros() {
        return cadastros;
    }

    public void setCadastros(List<Analista> cadastros) {
        this.cadastros = cadastros;
    }

}
