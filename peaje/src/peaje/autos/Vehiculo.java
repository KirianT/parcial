
package peaje.autos;

/**
 *
 * @author kirian
 * @since 18-09-2020
 * clase con los atributos que describen a un vehiculo en general
 * nombre es el tipo de vehiculo
 * placa es el codigo alfanumerico del vehiculo
 * marca es el nombre de la empresa que creo el vehiculo
 * valorPeaje es el costo del peaje del vehiculo
 */
public class Vehiculo  {
    private String nombre;
    private String placa;
    private String marca;
    private int valorPeaje;

    //constructor de la clase vehiculo
    public Vehiculo(String nombre, String placa, String marca, int valorPeaje) {
        this.nombre = nombre;
        this.placa = placa;
        this.marca = marca;
        this.valorPeaje = valorPeaje;
    }

    
     /**
     *getters y setters de la clase
     * toma el nombre del vehiculo
     */
    public String getNombre() {
        return nombre;
    }
    
    //devuelve el nombre del vehiculo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getValorPeaje() {
        return valorPeaje;
    }

    public void setValorPeaje(int valorPeaje) {
        this.valorPeaje = valorPeaje;
    }

    //metodo toString que me devuelve los atributos de la clase en String
    @Override
    public String toString() {
        return "{\n" +" \""+nombre+ "\""+":{\n   \"placa\":" + placa + "\","+ "\n   \"marca\":"+  marca + "\","+ "\n   \"valor\":" + valorPeaje + "\n }"+"\n}";
        // "<html>\n"+"  <header>\n"+"    <title>Vehiculos</title>\n"+"  </header>\n"+"  <body>\n"+"     <h1>"+nombre+"</h1>\n"+"        <li>placa:"+placa+"</li>\n"+"        <li>marca:"+marca+"</li>\n"+"        <li>valor del peaje:"+valorPeaje+"</li>\n"+"   </body>\n"+"</html>";
    }
    
}