
package peaje;

import java.util.List;
import java.util.ArrayList;
import peaje.autos.Automovil;
import peaje.autos.CamionDosEjes;
import peaje.autos.CamionUnEje;
import peaje.autos.Moto;
import peaje.autos.Vehiculo;


/**
 *
 * @author kirian
 * @since 18-09-2020
 * clase main que crea una lista con los tipos de vehiculos definidos en el programa y los muestra tipo json
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Vehiculo> vehiculo = new ArrayList<Vehiculo>();
	vehiculo.add(new Moto("","123abc","motico",12000));
	vehiculo.add(new Automovil("","456abc","carrito",20000));
	vehiculo.add(new CamionUnEje("","789abc","camioncito1",25000));
        vehiculo.add(new CamionDosEjes("","123def","camioncito2",3000));
        for(Vehiculo vehiculos:vehiculo) {
			System.out.println(vehiculos.toString());
		}
    }
    
}
