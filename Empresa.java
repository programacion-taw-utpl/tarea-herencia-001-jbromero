package paquete_laempresa;
import paquete_persona.*;
/**
 * @author jbromero
 */
public class Empresa {
    private String nombre;
    private String siglas;
    private String ciudad;
    private Trabajador trabajadores[];

    public Empresa(String nom, String sig, String ciu, Trabajador[] tra) {
        establecer_nombre(nom);
        establecer_siglas(sig);
        establecer_ciudad(ciu);
        establecer_trabajadores(tra);
    }
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_siglas(String sig){
        siglas = sig;
    }
    
    public String obtener_siglas(){
        return siglas;
    }
    
    public void establecer_ciudad(String ciu){
        ciudad = ciu;
    }
    
    public String obtener_ciudad(){
        return ciudad;
    }
    
    public void establecer_trabajadores(Trabajador[] tra){
        trabajadores = tra;
    }
    
    public Trabajador[] obtener_trabajadores(){
        return trabajadores;
    }
    
    @Override
    public String toString(){
        String cad = "";
        for (Trabajador trabajadore : trabajadores) {
            cad+=trabajadore.toString();
        }
        String cadena = String.format("Empresa: %s\nSiglas: %s\nCiudad: %s\nLista Trabajadores:\n%s",obtener_nombre(),obtener_siglas(),obtener_ciudad(),cad);
        return cadena;
    }
}
