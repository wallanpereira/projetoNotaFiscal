package src.dao;
import java.util.List;
import src.model.*;

public interface IDAO {
    public void inserir(IPersistente obj);
    public List<anteAnalista> pesquisar();
    public void alterar(IPersistente obj);
}
