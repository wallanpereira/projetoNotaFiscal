package src.control;

import src.model.*;
import src.dao.*;

public class ControladorBDAnalista implements IControlador{
    
    private IPersistente obj;
    private AnalistaDAO anDAO = new AnalistaDAO();
    
    public ControladorBDAnalista(){
    
    }

    @Override
    public void inserir(IPersistente obj) {
        this.obj = (Analista) obj;
        this.anDAO.inserir(this.obj);
    }  
}