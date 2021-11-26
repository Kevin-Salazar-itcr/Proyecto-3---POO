package Modelo;

import java.io.Serializable;
import javax.swing.ImageIcon;

public class Producto implements Serializable{
    private String nombre;
    private String codigo;
    private String descripcion;
    private double kal;
    private double precio;
    private double piezasxporcion;
    private double tamaño_gramos;
    private int cantidad; //cantidad del producto en un pedido
    private Tipo tipo;
    private boolean activo;
    private ImageIcon imagen;
    private int vecesPedido;


    public Producto() {}
    
    public Producto(String nombre, String codigo, String descripcion, double kal, double precio, double piezasxporcion, double tamaño_gramos, int cantidad,Tipo tipo, String rootImagen){
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.kal = kal;
        this.precio = precio;
        this.piezasxporcion = piezasxporcion;
        this.tamaño_gramos = tamaño_gramos;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.activo = true;
        
        this.imagen = new ImageIcon(this.getClass().getResource(rootImagen));
        this.vecesPedido = 0;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getKal() {
        return kal;
    }

    public void setKal(double kal) {
        this.kal = kal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPiezasxporcion() {
        return piezasxporcion;
    }

    public void setPiezasxporcion(double piezasxporcion) {
        this.piezasxporcion = piezasxporcion;
    }

    public double getTamaño_gramos() {
        return tamaño_gramos;
    }

    public void setTamaño_gramos(double tamaño_gramos) {
        this.tamaño_gramos = tamaño_gramos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getVecesPedido() {
        return vecesPedido;
    }

    public void setVecesPedido(int vecesPedido) {
        this.vecesPedido = vecesPedido;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", descripcion=" + descripcion + ", kal=" + kal + ", precio=" + precio + ", piezasxporcion=" + piezasxporcion + ", tama\u00f1o_gramos=" + tamaño_gramos + ", cantidad=" + cantidad + ", tipo=" + tipo + ", activo=" + activo + ", imagen=" + imagen + ", vecesPedido=" + vecesPedido + '}';
    }
    
    
    
    
}
