package designpatterns.examples.builder;

public class CoffeeBuilder {

    Coffee coffee;

    public CoffeeBuilder(CoffeeSizeEnum coffeeSize) {
        this.coffee = new Coffee(coffeeSize);
    }

    public CoffeeBuilder setMilk(boolean containsMilk) {
        coffee.setMilk(containsMilk);
        return this;
    }

    public CoffeeBuilder setSugar(double teaspoons){
        coffee.sugar = teaspoons;
        return this;
    }

    public CoffeeBuilder setSyrup(String syrupName){
        coffee.setSyrup(syrupName);
        return this;
    }

    public Coffee build() { //brew a coffee!
        return coffee;
    }
}
