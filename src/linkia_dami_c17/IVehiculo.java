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
/*En una interfaz únicamente defino los métodos sin FUNCIONALIDAD!!! SOLO DEFINO LA 
ESTRUCTURA QUE VA A TENER, las definiciones del cuerpo las hago en las clases que hereden*/
public interface IVehiculo {
    
    public void setNumeroDias(int dias);
    public void getPrecioTotalAlquilerPorDias();
    public void showInformacion();
    public void pideDatos();
    
}
