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
public class Coche extends Vehiculo{
    private String gamma = "A";
    
    
    public Coche(String matricula, String modelo, int numPlazas,String gamma) {
        super(matricula, modelo, numPlazas);
        this.gamma = gamma;
    }

    
    /*MÉTOD HEREDADOS DE COCHE PERO QUE VIENEN DE LA INTERFAZ IVEHICULO*/
    @Override
    public void showInformacion() {
        super.showInformacion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getPrecioTotalAlquilerPorDias() {
        super.getPrecioTotalAlquilerPorDias(); //To change body of generated methods, choose Tools | Templates.
    }

}
