/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronadapter;


public class Iphone4sAdapter implements CargarIphone{//concreteAdapter  clase de adaptador concreto

    private CargarIphone36 cargar;

    public Iphone4sAdapter(CargarIphone36 cargar) {
        this.cargar = cargar;
    }
    
    @Override
    public void cargar() {
        cargar.CargarIphone36();
        System.out.println("Adaptador para cargar IPhone 4s.");
    }
    
    
    
}
