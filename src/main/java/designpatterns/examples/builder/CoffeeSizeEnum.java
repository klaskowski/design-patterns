package designpatterns.examples.builder;

public enum CoffeeSizeEnum {
    ESPRESSO("Espresso"), DOUBLE_ESPRESSO("Double espresso"), AMERICANO("Americano");


    private final String label;
    public int x;

    CoffeeSizeEnum(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }

    public String getDescription() {
        return "";
    }
}
