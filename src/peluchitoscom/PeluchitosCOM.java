/*
 * @GWAIHIR
 */
package peluchitoscom;
import java.util.Scanner;

/**
 *
 * @author Mauricio Oliveros C
 */
public class PeluchitosCOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Globals
        int opt;
        String nombre;
        int cantidad;
        double precio;
        Scanner input = new Scanner(System.in);
        Producto[] tienda = new Producto[100];
        //
        System.out.println("PELUCHITOS.COM");
        int vig = 1, total = 0;
        while (vig != 7){
            System.out.println("[1] Agregar producto.");
            System.out.println("[2] Buscar producto.");
            System.out.println("[3] Eliminar producto.");
            System.out.println("[4] Mostrar Inventario.");
            System.out.println("[5] Realizar Venta.");
            System.out.println("[6] Mostrar ganancias totales.");
            System.out.println("[7] Salir.");
            System.out.print("Ingrese opcion: ");
            opt = input.nextInt();
            switch (opt) {
                case 1:
                    System.out.print("Nombre: ");
                    nombre = input.next();
                    System.out.print("Cantidad: ");
                    cantidad = input.nextInt();
                    System.out.print("Precio: ");
                    precio = input.nextDouble();
                    tienda[total].setNombre(nombre);
                    tienda[total].setCantidad(cantidad);
                    tienda[total].setPrecio(precio);
                    total++;
                    break;
                
                case 2:
                    System.out.print("Nombre a buscar: ");
                    String proc = input.next();
                    for (int i = 0; i<=total; i++){
                        if (proc == tienda[i].getNombre())
                            System.out.printf("Nombre: %s, Cantidad: %d, Precio: .2f%",tienda[i].getNombre(), tienda[i].getCantidad(), tienda[i].getPrecio());
                        else
                            System.out.println("Producto no encontrado...");
                    }
                    break;
                    
                case 3:
                    System.out.print("Nombre a eliminar: ");
                    String prod = input.next();
                    for (int j = 0; j<=total; j++){
                        if (prod == tienda[j].getNombre()){
                            tienda[j].setNombre(null);
                            tienda[j].setCantidad(0);
                            tienda[j].setPrecio(0.0);
                        }
                        else
                            System.out.println("Producto no encontrado...");
                    }
                    break;
                
                case 4:
                    System.out.print("Listado de productos: ");
                    for (int k = 0; k<=total; k++)
                       System.out.printf("%s %d  .2f%",tienda[k].getNombre(), tienda[k].getCantidad(), tienda[k].getPrecio());
                    break;
                    
                default: 
                    System.out.println("Opcion incorrecta, intenta de nuevo.");
            }
            
        }
    }
    
}
