/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp1;

/**
 *
 * @author azeez
 */
public class Sugar implements Ingredients {
     private String name;
 private Color color;    
 private double nomberOfCalories;
 private double volume;
    

    public Sugar(String name,Color color , double volume, double nomberOfCalories) {
        this.name = name;
        this.color = color;
        this.volume = volume;
        this.nomberOfCalories=nomberOfCalories;
    }

    @Override
    public String getName(){ 
        
        return name; }
    
    
    @Override
    public Color getColor(){ 
        
        return color; }
    
    
    @Override
    public double getNomberOfCalories(){ 
        
        return nomberOfCalories; }

    

    @Override
    public double getVolume(){ 
        
        return volume; }

    
    public String getInfo() {
        return "Sugar{" + "name=" + name + ", color=" + color + ", nomberOfCalories=" + nomberOfCalories + ", volume=" + volume + '}';
    }
}
