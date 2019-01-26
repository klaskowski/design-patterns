package designpatterns.examples.nutritionbuilder;

public class NutritionBuilder {
    String name;
    int calories;
    double protein;
    double fat;
    double carbs;
    boolean isFood;

    public NutritionBuilder() {
    }

    public NutritionBuilder setName(String name){
        this.name = name;
        return this;
    }

    public NutritionBuilder setCalories(int calories){
        this.calories = calories;
        return this;
    }

    public NutritionBuilder setProtein(int protein){
        this.protein = protein;
        return this;
    }

    public NutritionBuilder setFat(int fat){
        this.fat = fat;
        return this;
    }

    public NutritionBuilder setCarbs(int carbs){
        this.carbs = carbs;
        return this;
    }

    public NutritionBuilder setIsFood(boolean isFood){
        this.isFood = isFood;
        return this;
    }

    public NutritionProduct build() {
        NutritionProduct product = isFood ? new Food() : new Drink();

        product.name = this.name;
        product.calories = this.calories;
        product.carbs = this.carbs;
        product.fat = this.fat;
        product.protein = this.protein;

        return product;
    }

    public static void main(String[] args) {
        NutritionBuilder builder = new NutritionBuilder()
                .setIsFood(false)
                .setName("coffee")
                .setCalories(80);

        NutritionProduct product = builder.build();
        System.out.println("product = " + product.toString());
    }
}


