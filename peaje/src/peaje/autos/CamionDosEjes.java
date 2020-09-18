
package peaje.autos;

/**
 *
 * @author Kirian
 * @since 18-09-2020
 * clase que define los atributos heredados de la clase padre Vehiculo, para un camion de dos o mas ejes
 */
public class CamionDosEjes extends Vehiculo{

    //constructor de la clase CamionDosEjes
    public CamionDosEjes(String nombre, String placa, String marca, int valorPeaje) {
        super("Camion de dos o mas ejes", placa, marca, valorPeaje);
    }
    
    
}
