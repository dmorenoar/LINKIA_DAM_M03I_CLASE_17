/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c17;

/**
 *
 * @author dmorenoar
 */
public class Camion extends Carga{
    private String tipoEstructura;
    
    public Camion(String matricula, String modelo, int numPlazas, int PMA,String tipoEstructura) {
        super(matricula, modelo, numPlazas, PMA);
        this.tipoEstructura = tipoEstructura;
        //super.pideDatos();
    }
    
    /*
    public Camion(){
        super("111", "aa", 3, 3500);
        showInformacion();
    }
   */  
    
    
    /*MÉTOD HEREDADOS DE CARGA PERO QUE VIENEN DE VEHICULO Y A SU VEZ VIENEN LA INTERFAZ IVEHICULO*/
    @Override
    public void showInformacion() {
        super.showInformacion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getPrecioTotalAlquilerPorDias() {
        super.getPrecioTotalAlquilerPorDias(); //To change body of generated methods, choose Tools | Templates.
    }
   
}
