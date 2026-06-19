/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarrosController;
    import java.util.ArrayList;
import CarrosModel.carros_model;
/**
 *
 * @author PC
 */
public class carros_controller {
    
    public ArrayList<carros_model> listaCarros = new ArrayList<>();

    public void agregarCarro(carros_model carro) {
        listaCarros.add(carro);
        System.out.println("Carro agregado");
    }
    
    public void listarCarros() {
        for (carros_model carro : listaCarros) {
            System.out.println(carro);
        }
    }
    public carros_model buscarCarro(int codigo) {
        for (carros_model carro : listaCarros) {
            if (carro.getCodigo() == codigo) {
                return carro;
            }
        }
        return null;
    }
}
