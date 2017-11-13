package paquete_laempresa;
import paquete_persona.*;
/**
 * @author jbromero
 */
public class EmpresaPrivada extends Empresa{
    private int ventas_mensual_fijo;
    private int numero_sucursales;

    public EmpresaPrivada(String nom, String sig, String ciu, Trabajador[] tra, int ven_men_fi, int num_suc) {
        super(nom, sig, ciu, tra);
        establecer_ventas_mensual_fijo(ven_men_fi);
        establecer_numero_sucursales(num_suc);
    }
    
    public void establecer_ventas_mensual_fijo(int ven_men_fi){
        ventas_mensual_fijo = ven_men_fi;
    }
    
    public int obtener_ventas_mensual_fijo(){
        return ventas_mensual_fijo;
    }
    
    public void establecer_numero_sucursales(int num_suc){
        numero_sucursales = num_suc;
    }
    
    public int obtener_numero_sucursales(){
        return numero_sucursales;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s\nVentas: %d\nSucursales: %d",super.toString(),obtener_ventas_mensual_fijo(),obtener_numero_sucursales());
        return cadena;
    }
}
