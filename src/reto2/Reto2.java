
package reto2;

import java.util.Scanner;

public class Reto2 {

    private final Scanner scanner = new Scanner(System.in);
    
    public String read(){
        return this.scanner.nextLine();
    }
        
    public void run(){
        
        String op = read();
        BaseDatosProductos bd = new BaseDatosProductos();
        String [] entrada = read().split(" ");
        int codigo = Integer.parseInt(entrada[0]);
        String nombre = entrada[1];
        double precio = Double.parseDouble(entrada[2]);
        int inventario = Integer.parseInt(entrada[3]);
        
        Producto producto = new Producto(codigo, nombre, precio, inventario);
               
                
        switch (op){
            
            case "AGREGAR":
                bd.agregarProducto(producto);
                break;
            
            case "BORRAR":
                bd.eliminarProducto(producto);
                break;
            
            case "ACTUALIZAR":
                bd.actualizarProducto(producto);
                break;
                  
            case "GENERAR INFORME":
                bd.generarInforme();
                break;
            
            default:
                break;
            
        } 
    }
    
    public static void main(String[] args) {
        Reto2 ejecucion =new Reto2();
        ejecucion.run();
    }
    
}
