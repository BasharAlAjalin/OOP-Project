/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailapp1;

import java.util.ArrayList;

/**
 *
 * @author azeez
 */
public class Cocktail {
     private double nomberOfCalories;
    private ArrayList<Ingredients> ingredients;
    private Color color; 
    private String name;
    String info;
    public Cocktail(String name, ArrayList<Ingredients> ingredients, String info) {
        this.info=info;
        this.ingredients = ingredients;
        this.nomberOfCalories = calculateTotalCalories();
        this.name=name;
    }
    

    private double calculateTotalCalories() {
        int total = 0;
        for (Ingredients ingredient : ingredients) {
            total += ingredient.getNomberOfCalories();
        }
        return total;
    }
    
      public void calculateColor() {
        int red = 0, green = 0, blue = 0;
        int count = 0;
        for (Ingredients ingredient : ingredients) {
            Color ingredientColor = ingredient.getColor();
            red += ingredientColor.getRed();
            green += ingredientColor.getGreen();
            blue += ingredientColor.getBlue();
            count++;
        }
         color=new Color(red / count, green / count, blue / count);
    }
    
       public double getNomberOfCalories() {
        return nomberOfCalories;
    }

    public void setNomberOfCCalories(double nomberOfCalories) {
        this.nomberOfCalories = nomberOfCalories;
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    public String getInfo() {
        calculateColor();
        
        
        return   "number of calories in blender: " + nomberOfCalories 
               + "\n color:" + "("+color.getRed()+ " "+color.getGreen() +", "+color.getBlue() +")\n"+ info;
    }
}
