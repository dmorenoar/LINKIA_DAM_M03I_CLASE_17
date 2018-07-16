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
public class Carga extends Vehiculo{
    
    private int PMA;
    
    public Carga(String matricula, String modelo, int numPlazas, int PMA) {
        super(matricula, modelo, numPlazas);
        this.PMA = PMA;
    }

    /*MÉTOD HEREDADOS DE VEHICULO PERO QUE VIENEN DE LA INTERFAZ IVEHICULO*/
    @Override
    public void pideDatos() {
        System.out.println("Hola que tal");
        super.pideDatos(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showInformacion() {
        super.showInformacion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getPrecioTotalAlquilerPorDias() {
        super.getPrecioTotalAlquilerPorDias(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
