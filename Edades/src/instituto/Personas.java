package instituto;
/**
 * @author Adrian
 */
public class Personas {
    private String cedula,Nombre;
    private double edad;
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    } 
    
    public String toString(){
        return " se llama "+getNombre()+" Tiene la edad de "+getEdad()+" y su cedula es "+getCedula();
    }
    
}
