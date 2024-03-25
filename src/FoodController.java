import Pojo.FoodItem;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FoodController {

    private ArrayList<FoodItem> foodsList = new ArrayList();

    public void addFoodDemo(){
         addFoodItems();
    }



    public ArrayList<FoodItem> getListOfFoodDemo(){
        return getListOfFood();
    }

    private ArrayList<FoodItem> getListOfFood() {
        return foodsList.size()>0 ? foodsList : null;
    }

    public int getCostOfApplesDemo (){
        return getCostOfApples();
    }

    public int getTotalCostDemo(){

        return getTotalCost();
    }

    private int getTotalCost(){
        int totalCost = foodsList.stream().reduce(0,(a,b)->a+ b.getPrice(), Integer::sum);
        return totalCost;
    }
    private int getCostOfApples(){
        int costOfApples = foodsList.stream().filter(foodItem -> foodItem.getFoodName().equalsIgnoreCase("Apple")).reduce(0, (a, b) -> a + b.getPrice(), Integer::sum);
        return costOfApples;
    }

    public  Stream<FoodItem> getAllFruits(){
        return foodsList.stream().filter(foodItem -> foodItem.getFoodCategory().equalsIgnoreCase("Fruit"));
    }


    private void addFoodItems(){

        FoodItem foodItem1 = new FoodItem("Apple", "Fruit", 220);
        FoodItem foodItem2 = new FoodItem("Grapes", "Fruit", 180);
        FoodItem foodItem3 = new FoodItem("Watermelon", "Fruit", 160);

        FoodItem foodItem4 = new FoodItem("Cabbage", "Vegetable", 120);
        FoodItem foodItem5 = new FoodItem("Potato", "Vegetable", 120);
        FoodItem foodItem6 = new FoodItem("Carots", "Vegetable", 120);

        FoodItem foodItem7 = new FoodItem("Rasmalai", "Sweets", 120);
        FoodItem foodItem8 = new FoodItem("Pantua", "Sweets", 120);
        FoodItem foodItem9 = new FoodItem("Rosgulla", "Sweets", 120);

        FoodItem foodItem10 = new FoodItem("Haldi", "Spices", 120);
        FoodItem foodItem11 = new FoodItem("Jeera", "Spices", 120);

        foodsList.add(foodItem1);
        foodsList.add(foodItem2);
        foodsList.add(foodItem3);
        foodsList.add(foodItem4);
        foodsList.add(foodItem5);
        foodsList.add(foodItem6);
        foodsList.add(foodItem7);
        foodsList.add(foodItem8);
        foodsList.add(foodItem9);
        foodsList.add(foodItem10);
        foodsList.add(foodItem11);
    }


}
