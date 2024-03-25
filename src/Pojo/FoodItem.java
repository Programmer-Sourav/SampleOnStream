package Pojo;

public class FoodItem {
    private String foodName;

    public FoodItem(String foodName, String foodCategory, int price) {
        this.foodName = foodName;
        this.foodCategory = foodCategory;
        this.price = price;
    }

    private String foodCategory;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;


    @Override
    public String toString(){
        return "\n\n Name: "+foodName+ ", "+ "Category: "+ foodCategory+", "+ "Price: "+price;
    }
}
