package Modelo;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> productos;

    public Pedido() {
        productos = new ArrayList();
    }

    public void addProducto(Producto producto, int cant){

        for(int i=0; i<productos.size(); i++){
            Producto actual = productos.get(i);
            if (producto.getCodigo().equals(actual.getCodigo()))
            {
                actual.setCantidad(actual.getCantidad()+cant); //cod repetido -> agrega cantidad del producto.
                return;
            }
        }
        productos.add(producto);
    }
}
