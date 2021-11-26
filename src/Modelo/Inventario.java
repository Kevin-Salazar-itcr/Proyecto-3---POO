package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Inventario implements Serializable{
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public Inventario(){}

    public boolean addProducto(Producto producto){

        for(int i=0; i<productos.size(); i++){
            Producto actual = productos.get(i);
            if (producto.getCodigo()==actual.getCodigo())
            {
                return false; //if codigo repetido -> return false, no se agrega.
            }
        }
        productos.add(producto);
        return true;
    }

    public boolean newProducto(String nombre, String codigo, String descripcion, double kal, double precio, double piezasxporcion, double tamaño_gramos, int cantidad, Tipo tipo, String rootImagen) {
        Producto nuevo = new Producto(nombre, codigo, descripcion, kal, precio, piezasxporcion, tamaño_gramos, cantidad, tipo, rootImagen);
        if (addProducto(nuevo)) {
            return true;
        } else {
            return false;
        }
    }

    public void contUpForProducto(String cod, int cant)
    {
        for(int i = 0; i<productos.size();i++)
        {
            Producto actual = productos.get(i);
            if(cod == actual.getCodigo())
            {
                actual.setCantidad(actual.getCantidad()+cant);
            }
        }
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
    public void imprimir(){
        
        for (int i = 0; i< productos.size(); i++){
            
            System.out.println("----------------------------------------------");
            System.out.println(productos.get(i).toString());
            
        }
        
        System.out.println("----------------------------------------------");
        
    }
    
    
    
}
