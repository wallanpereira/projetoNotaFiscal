package src.control;

import src.model.*;
import src.dao.*;

public class ControladorBDAnteAnalista implements IControlador{

    private IPersistente obj;
    private anteAnalistaDAO anteDAO = new anteAnalistaDAO();
    
    public ControladorBDAnteAnalista(){
        
    }
    
    @Override
    public void inserir(IPersistente obj) {
        this.obj = (anteAnalista) obj;
        this.anteDAO.inserir(this.obj);
    }    
}
