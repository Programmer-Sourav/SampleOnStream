import Pojo.FoodItem;

import java.util.ArrayList;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        FoodController foodController = new FoodController();
        foodController.addFoodDemo();
        ArrayList<FoodItem> foods = foodController.getListOfFoodDemo();

        System.out.print("\n\n\n*****************Foods List ******************");
        for(FoodItem food: foods){
            System.out.print(food);
        }


        Stream<FoodItem> allfruits = foodController.getAllFruits();
        System.out.print("\n\n\n*****************Printing All Fruits List ****************** ");
        Stream<String> fruits = allfruits.map(FoodItem::toString);
        fruits.forEach(System.out::println);

        int totalCostOfApples = foodController.getCostOfApplesDemo();
        System.out.print("\n\n\n*********Total Cost of Apples **** "+ totalCostOfApples);

        int totalCostOfFruits = foodController.getTotalCostDemo();
        System.out.print("\n\n\n**********Total Cost Of Fruits***** "+ totalCostOfFruits );
    }
}