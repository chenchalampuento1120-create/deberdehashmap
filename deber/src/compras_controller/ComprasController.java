/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_controller;

import java.util.ArrayList;
import ComprasModel.ComprasModel;

/**
 *
 * @author Estudiante
 */
public class ComprasController {

    public ArrayList<ComprasModel> listaCompras = new ArrayList<>();

    // Agregar o crear
    public void agregarCompra(ComprasModel compra) {
        listaCompras.add(compra);
        System.out.println("Compra agregada");
    }

    // Listar o mostrar
    public void listarCompras() {
        for (ComprasModel compra : listaCompras) {
            System.out.println(compra);
        }
    }

    // Buscar compra
    public ComprasModel buscarCompra(int codigo) {
        for (ComprasModel compra : listaCompras) {
            if (compra.getCodigo() == codigo) {
                return compra;
            }
        }
        return null;
    }

    // Eliminar o borrar
    public boolean eliminarCompra(int codigo) {
        ComprasModel compra = buscarCompra(codigo);

        if (compra != null) {
            listaCompras.remove(compra);
            return true;
        }
        return false;
    }

    // Actualizar
    public boolean actualizarCompra(int codigo, String nombre, double precio, int cantidad) {
        ComprasModel compra = buscarCompra(codigo);

        if (compra != null) {
            compra.setNombre(nombre);
            compra.setPrecio(precio);
            compra.setCantidad(cantidad);
            return true;
        }

        return false;
    }
}
