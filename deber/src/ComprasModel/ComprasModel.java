/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComprasModel;

/**
 *
 * @author Estudiante
 */
public class ComprasModel {
    
    private int codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor
    public ComprasModel(int codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Calcular subtotal
    public double subtotal() {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo +
               " | Nombre: " + nombre +
               " | Precio: $" + precio +
               " | Cantidad: " + cantidad +
               " | Subtotal: $" + subtotal();
    }
}