package BurgerClass;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;



    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Whole wheat");


    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;

    }

    /*
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
    */
    @Override
    public double itemizeHamburger() {
        double healthyBurgerPrice = super.itemizeHamburger();
       //System.out.println("Healthy hamburger " + "on a Whole Wheat roll with " + meat + ", price is " + price);

        if (healthyExtra1Name != null) {
            healthyBurgerPrice += healthyExtra1Price;
        }
        if (healthyExtra2Name != null) {
            healthyBurgerPrice += healthyExtra2Price;
        }
        return healthyBurgerPrice;
    }

}