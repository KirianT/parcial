
package peaje.autos;

/**
 *
 * @author Kirian
 * @since 18-09-2020
 * clase que define los atributos heredados de la clase padre Vehiculo, para la clase Automovil 
 */
public class Automovil extends Vehiculo{
    
    //constructor de la clase Automovil
    public Automovil(String nombre, String placa, String marca, int valorPeaje) {
        super("Automovil", placa, marca, valorPeaje);
    }
}
