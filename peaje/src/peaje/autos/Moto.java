
package peaje.autos;

/**
 *
 * @author Kirian
 * @since 18-09-2020
 * clase que define los atributos heredados de la clase padre Vehiculo, para la clase Moto 
 */
public class Moto extends Vehiculo {

    //constructor de la clase Moto
    public Moto(String nombre, String placa, String marca, int valorPeaje) {
        super("Moto", placa, marca, valorPeaje);
    }
    
    
    
}
