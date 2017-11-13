package paquete_principal;
import paquete_laempresa.*;
import paquete_persona.*;
/**
 * @author jbromero
 */
public class Principal {
    public static void main(String[] args) {
        Trabajador a = new Trabajador("Ana Luisa","Velez Alcivar",30,12903939,100,40,10);
        Trabajador a1 = new Trabajador("Mario Anibal","Vela Narvaez",35,212889,100,50,10);
        Trabajador[] trabajadores = {a,a1};
        EmpresaPrivada e = new EmpresaPrivada("Soluciones Software","SS's","Loja",trabajadores,200000,12);
        
        System.out.println(e);
    }
}
