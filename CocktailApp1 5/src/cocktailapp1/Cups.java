/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp1;

/**
 *
 * @author azeez
 */
public class Cups {
   private double capacity;
    private int contentCalories;

    public Cups(double capacity) {
        this.capacity = capacity;
        this.contentCalories = 0;
    }

    
    public String getInfo() {
        return "Cups{" + "capacity=" + capacity + ", contentCalories=" + contentCalories + '}';
    } 
}
