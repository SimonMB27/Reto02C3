
package reto2;

import java.util.HashMap;


public class BaseDatosProductos {
    
    HashMap<Integer,Producto> listaProductos = new HashMap();
    
        public BaseDatosProductos(){
            listaProductos.put( 1,new Producto( 1, "Manzanas",   5000, 25));
            listaProductos.put( 2,new Producto( 2,"Limones",    2300, 15));
            listaProductos.put( 3,new Producto( 3,"Peras",      2700, 33));
            listaProductos.put( 4,new Producto( 4,"Arandanos",  9300,  5));
            listaProductos.put( 5,new Producto( 5,"Tomates",    2100, 42)); 
            listaProductos.put( 6,new Producto( 6,"Fresas",     4100,  3));
            listaProductos.put( 7,new Producto( 7,"Helado",     4500, 41));
            listaProductos.put( 8,new Producto( 8,"Galletas",    500,  8));
            listaProductos.put( 9,new Producto( 9,"Chocolates", 3500, 80));
            listaProductos.put(10,new Producto(10,"Jamon",     15000, 10));
        
        }
     
        public void agregarProducto(Producto producto){
            if(!listaProductos.containsKey(producto.getCodigo())){
                listaProductos.put(producto.getCodigo(),producto);
                generarInforme();
            }
            else{
                System.out.println("ERROR");
            }
            
        }
        
        public void eliminarProducto(Producto producto){
            if(listaProductos.containsKey(producto.getCodigo())){
                listaProductos.remove(producto.getCodigo());
                generarInforme();
            }
            else{
                System.out.println("ERROR");
            }
            
        }
        
        public void actualizarProducto(Producto producto){
            if(listaProductos.containsKey(producto.getCodigo())){
                listaProductos.replace(producto.getCodigo(), producto);
                generarInforme();
            }
            else{
                System.out.println("ERROR");
            }
            
        }
        
        public void generarInforme(){
            double suma=0;
            for (Producto producto:listaProductos.values()){
                suma = suma + (producto.getPrecio()*producto.getInventario());
            }
            System.out.println(String.format("%.1f",suma));            
        }
    
    }
   


