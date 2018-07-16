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
public abstract class Vehiculo implements IVehiculo{
    private String matricula;
    private String modelo;
    private int numPlazas;

    public Vehiculo(String matricula, String modelo, int numPlazas) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.numPlazas = numPlazas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    /*MÉTODOS HEREDADOS DE LA INTERFAZ IVEHICULO*/
    @Override
    public void setNumeroDias(int dias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getPrecioTotalAlquilerPorDias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pideDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}
