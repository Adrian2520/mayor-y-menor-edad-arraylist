package instituto;

import java.util.ArrayList;

/**
 * @author Adrian
 */
public class ListasPersonas {
    
    public double sumaEdad(Personas[] p){
        
        double sumEdad=0;
        
        for (Personas r:p){
            sumEdad=sumEdad+r.getEdad();
        }
     
        double resultado=sumEdad/p.length;
        return resultado;
        
    }
    
    public double edadMax(ArrayList<Personas> p){
        
        double max=p.get(0).getEdad();
        
        for (int i = 1; i < p.size(); i++) {
            if (p.get(i).getEdad()>max){
                max=p.get(i).getEdad();
            }
            
        }
        
        return max;
     
    }
    
    public Personas edadMaxPersona(ArrayList<Personas> p){
        
       Personas max=new Personas();
        
        max=p.get(0);
        
        for (int i = 1; i < p.size(); i++) {
            if (p.get(i).getEdad()>max.getEdad()){
                max=p.get(i);
            }
            
        }
        
        return max;
     
    }
    
     public Personas edadMinPersona(ArrayList<Personas> p){
        
       Personas max=new Personas();
        
        max=p.get(0);
        
        for (int i = 1; i > p.size(); i++) {
            if (p.get(i).getEdad()>max.getEdad()){
                max=p.get(i);
            }  
        }
        
        return max;
     
    }
  
       
}

