package paquete_persona;
/**
 * @author jbromero
 */
public class Trabajador extends Persona{
    private int costo_seguro;
    private int horas_trabajadas;
    private int costo_por_horas;

    public Trabajador(String nom, String ape, int ed, int ced, int cos_seg, int hor_tra, int cos_por_hor) {
        super(nom, ape, ed, ced);
        establecer_costo_seguro(cos_seg);
        establecer_horas_trabajadas(hor_tra);
        establecer_costo_por_horas(cos_por_hor);
    }
    
    public void establecer_costo_seguro(int cos_seg){
        costo_seguro = cos_seg;
    }
    
    public int obtener_costo_seguro(){
        return costo_seguro;
    }
    
    public void establecer_horas_trabajadas(int hor_tra){
        horas_trabajadas = hor_tra;
    }
    
    public int obtener_horas_trabajadas(){
        return horas_trabajadas;
    }
    
    public void establecer_costo_por_horas(int cos_por_hor){
        costo_por_horas = cos_por_hor;
    }
    
    public int obtener_costo_por_horas(){
        return costo_por_horas;
    }
    
    public int obtener_sueldo (){
        int sueldo = (horas_trabajadas * costo_por_horas)+costo_seguro;
        return sueldo;
    }
    @Override
    public String toString(){
        String cadena = String.format("   %s\n   Seguro: $ %d\n   Horas Trabajadas: %d\n   Valor x Hora: $ %d\n   Sueldo: $ %d",super.toString(),obtener_costo_seguro(),obtener_horas_trabajadas(),obtener_costo_por_horas(),obtener_sueldo());
        return cadena;
    }
}
