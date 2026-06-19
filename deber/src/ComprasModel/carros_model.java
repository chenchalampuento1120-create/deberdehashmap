/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComprasModel;

/**
 *
 * @author PC
 */
public class carros_model {

    private int codigo;
    private String marca;
    private String modelo;
    private double precio;

    public carros_model(int codigo, String marca, String modelo, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Codigo: " + codigo +
               " | Marca: " + marca +
               " | Modelo: " + modelo +
               " | Precio: $" + precio;
    }
}
    



    
