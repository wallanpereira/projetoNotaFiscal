package src.bean;

import java.util.List;
import src.dao.*;
import java.util.ArrayList;
import src.model.anteAnalista;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="anteciparBean")
@SessionScoped
public class anteAnalistaBean {
    
    private anteAnalista anteAna = new anteAnalista();
    private List<anteAnalista> antecipar = new ArrayList<>();
    private anteAnalistaDAO anteDAO = new anteAnalistaDAO();
    
    public void adicionarAnte(){
        antecipar.add(anteAna);
        anteDAO.inserir(anteAna);
        anteAna = new anteAnalista();
    }
    public void alterar(anteAnalista ob){
        anteAna = ob;
    }
    public void listar(){
         antecipar = anteDAO.pesquisar();
    }
    public anteAnalista getAnteAnalista(){
        return anteAna;
    }    
    public void setAnteAnalista(anteAnalista anteAna){
        this.anteAna = anteAna;
    }
    public List<anteAnalista> getAntecipar(){
        return antecipar;
    }
    public void setAntecipar(List<anteAnalista> antecipar){
        this.antecipar = antecipar;
    }
}
