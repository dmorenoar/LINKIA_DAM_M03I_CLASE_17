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
public class LINKIA_DAMI_C17 {

    /**
     * @param args the command line arguments
     */
    private static IVehiculo[] garaje = new IVehiculo[4];
    
    //private static Camion[] camiones = new Camion[4];
    
    public static void main(String[] args) {
       
        
        //Vehiculo v = new Vehiculo("111F", "Honda", 10);
        
        
        /*USO DEL POLIMORFISMO- AL HEREDAR CAMION Y COCHE DE IVEHICULO O VEHICULO LOS PUEDO
        PONER EN EL ARRAY. EN CAMBIO UNA CLASE AJENA NO PODRÁ ENTRAR EN EL ARRAY PORQUE NO HEREDA
        DE LA CLASE CON LA QUE ESTA FORMADA EL ARRAY*/
        Camion camion = new Camion("111", "zuk", 3, 3500, "fija");
        Coche coche = new Coche("1170F", "HONDA", 3, "fijo");
        Desconocido desco = new Desconocido();
        
        garaje[0] = camion;
        garaje[1] = coche;
        
        //camiones[0] = camion;
        
        //garaje[2] = desco;
             
    }
}
