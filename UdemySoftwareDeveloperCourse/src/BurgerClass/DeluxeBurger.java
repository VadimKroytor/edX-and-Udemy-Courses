package BurgerClass;

public class DeluxeBurger extends Hamburger {

    private boolean areChipsAdded = false;
    private boolean isDrinkAdded = false;
    public DeluxeBurger() {
        super("Deluxe", "vegan chicken", 15.10, "White");
        super.addHamburgerAddition1("Chips", 2.00);
        super.addHamburgerAddition2("Drink", 2.00);



    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
            System.out.println("No extra additions are allowed");

    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
            System.out.println("No extra additions are allowed");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("No extra additions are allowed");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("No extra additions are allowed");
    }

}