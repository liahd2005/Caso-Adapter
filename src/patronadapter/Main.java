/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronadapter;


public class Main {

    
    public static void main(String[] args) {
        
        CargarIphone36 cargarIphone36 = new CargarIphone36();
        CargarIphone adapter=new Iphone4sAdapter(cargarIphone36);
        
        Ogro ogro=new Ogro(adapter);
        ogro.CargarIphone();
    }
    
}
