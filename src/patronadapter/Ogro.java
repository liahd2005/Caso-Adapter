/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronadapter;


public class Ogro {
    
    private CargarIphone cargar;

    public Ogro(CargarIphone cargar) {
        this.cargar = cargar;
    }
    
    public void CargarIphone(){
        cargar.cargar();
    }
    
}
