package edu.lavadora.controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import edu.lavadora.modelo.Peso;

@Named(value = "calculo")
@SessionScoped
public class Calculo implements Serializable {

    private Peso objCal = new Peso();
    
    public Calculo() {
    }
    
    public void calcularNivel(){
        objCal.Nivel();
    
    }
    
    public void calcularAgua(){
        objCal.Agua();
    }

    public Peso getObjCal() {
        return objCal;
    }

    public void setObjCal(Peso objCal) {
        this.objCal = objCal;
    }
    
}
