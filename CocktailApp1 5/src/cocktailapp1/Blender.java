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
public class Blender  {
   private ArrayList<Ingredients> ingredients;
    private double capacity;
    private double totalVolume;

    public Blender(double capacity) {
        this.capacity = capacity;
        this.ingredients = new ArrayList<>();
        this.totalVolume = 0;
    }

  public void addIngredient(Ingredients ingredient) throws BlenderOverFlowException {
        if (totalVolume + ingredient.getVolume() > capacity) {
            throw new BlenderOverFlowException("Blender capacity exceeded");
        }
        ingredients.add(ingredient);
        totalVolume += ingredient.getVolume();
    }
  public void pour(Cups cup) throws BlenderEmptyException {
        if (totalVolume == 0) {
            throw new BlenderEmptyException("Cannot pour from an empty blender");
        }
  }
  
    public double getTotalNomberOfCalories() {
        double nomberOfCalories = 0;
        for (Ingredients ingredient : ingredients) {
            nomberOfCalories += ingredient.getNomberOfCalories();
        }
        return nomberOfCalories;
    }

    public double getTotalVolume() {
        return totalVolume;
    }

    public String getInfo() {
        return "Blender{" + "ingredients=" + ingredients + ", capacity=" + capacity + ", totalVolume=" + totalVolume + '}';
    }

}
