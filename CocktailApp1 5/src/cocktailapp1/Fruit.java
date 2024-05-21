/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp1;

/**
 *
 * @author azeez
 */
public class Fruit implements Ingredients {
     private String name;
   private Color color;  
   private double nomberOfCalories;
    private double volume;
    

    public Fruit(String name, Color color ,double nomberOfCalories, double volume)  {
        this.name = name;
        this.color = color;
        this.nomberOfCalories = nomberOfCalories;
        this.volume = volume;
    
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
        return "Fruit{" + "name=" + name + ", color=" + color + ", nomberOfCalories=" + nomberOfCalories + ", volume=" + volume + '}';
    }
}
