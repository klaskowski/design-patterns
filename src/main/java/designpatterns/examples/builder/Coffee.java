package designpatterns.examples.builder;

public class Coffee {

    double sugar; // measured in teaspoons of sugar
    String syrup;
    CoffeeSizeEnum coffeeSize;
    boolean containsMilk;
    String sprinkles;

    Coffee(CoffeeSizeEnum coffeeSize) {
        this.coffeeSize = coffeeSize;
    }


    // ---------------------------------------------
    //  Konstruktory teleskopowe
    // ---------------------------------------------

    Coffee(CoffeeSizeEnum coffeeSize, double sugar) {
        this.coffeeSize = coffeeSize;
        this.sugar = sugar;
    }

    Coffee(CoffeeSizeEnum coffeeSize, double sugar, String syrup) {
        this.coffeeSize = coffeeSize;
        this.sugar = sugar;
        this.syrup = syrup;
    }

    Coffee(CoffeeSizeEnum coffeeSize, double sugar, String syrup, boolean containsMilk) {
        this.coffeeSize = coffeeSize;
        this.sugar = sugar;
        this.syrup = syrup;
        this.containsMilk = containsMilk;
    }

    Coffee(CoffeeSizeEnum coffeeSize, double sugar, String syrup, boolean containsMilk, String sprinkles) {
        this.coffeeSize = coffeeSize;
        this.sugar = sugar;
        this.syrup = syrup;
        this.containsMilk = containsMilk;
        this.sprinkles = sprinkles;
    }

    //  Gdy parametry obiektu są opcjonalne, i jest ich bardzo dużo, powstawałaby ogromna liczba kombinacji,
    //  możliwe byłyby konflikty w konstruktorach (te same typy)

    Coffee(CoffeeSizeEnum coffeeSize, String syrup, boolean containsMilk) {
        this.coffeeSize = coffeeSize;
        this.syrup = syrup;
        this.containsMilk = containsMilk;
    }

    Coffee(CoffeeSizeEnum coffeeSize, double sugar, boolean containsMilk) {
        this.coffeeSize = coffeeSize;
        this.sugar = sugar;
        this.containsMilk = containsMilk;
    }

    Coffee(CoffeeSizeEnum coffeeSize, boolean containsMilk) {
        this.coffeeSize = coffeeSize;
        this.containsMilk = containsMilk;
    }

    Coffee(CoffeeSizeEnum coffeeSize, String syrup) {
        this.coffeeSize = coffeeSize;
        this.syrup = syrup;
    }

    // ....
    // ---------------------------------------------



    void setMilk(boolean containsMilk){
        this.containsMilk = containsMilk;
    }

    void setSugar(double teaspoons){
        this.sugar = teaspoons;
    }

    void setSyrup(String syrupName) {
        this.syrup = syrupName;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.coffeeSize);
        stringBuilder.append(", ");
        stringBuilder.append(this.containsMilk ? "with milk" : "without milk");
        stringBuilder.append(", ");
        stringBuilder.append(this.sugar);
        stringBuilder.append(" teaspoons of sugar");
        if(this.syrup.isEmpty()) {
            stringBuilder.append(".");
        } else {
            stringBuilder.append(String.format(", with delicious, limited edition %s syrup", this.syrup));
        }
        return stringBuilder.toString();
    }
}
