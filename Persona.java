package paquete_persona;
/**
 * @author jbromero
 */
public class Persona {
    private String nombres;
    private String apellidos;
    private int edad;
    private int cedula;

    public Persona(String nom, String ape, int ed, int ced) {
        establecer_nombres(nom);
        establecer_apellidos(ape);
        establecer_edad(ed);
        establecer_cedula(ced);
    }
    
    public void establecer_nombres(String nom){
        nombres = nom;
    }
    
    public String obtener_nombres(){
        return nombres;
    }
    
    public void establecer_apellidos(String ape){
        apellidos = ape;
    }
    
    public String obtener_apellidos(){
        return apellidos;
    }
    
    public void establecer_edad(int ed){
        edad = ed;
    }
    
    public int obtener_edad(){
        return edad;
    }
    
    public void establecer_cedula(int ced){
        cedula = ced;
    }
    
    public int obtener_cedula(){
        return cedula;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\n\n   %s %s\n   %d años de edad\n   CI: %d",obtener_nombres(),obtener_apellidos(),obtener_edad(),obtener_cedula());
        return cadena;
    }
}
