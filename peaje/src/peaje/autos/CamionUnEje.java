
package peaje.autos;

/**
 *
 * @author Kirian
 * @since 18-09-2020
 * clase que define los atributos heredados de la clase padre Vehiculo, para un camion de un eje
 */
public class CamionUnEje extends Vehiculo {

    public CamionUnEje(String nombre, String placa, String marca, int valorPeaje) {
        super("Camion de un eje", placa, marca, valorPeaje);
    }
    
    
}
