/*
 * @GWAIHIR
 */
package peluchitoscom;

/**
 *
 * @author Mauricio Oliveros C
 */
public class Producto {
    //
    private String Nombre;
    private int Cantidad;
    private double Precio;
    //
    public String getNombre() {
        return Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }
    //
    public void setNombre(String n) { Nombre = n; }
    public void setCantidad(int c) { Cantidad = c; }
    public void setPrecio(double p) { Precio = p; }

}

// end class