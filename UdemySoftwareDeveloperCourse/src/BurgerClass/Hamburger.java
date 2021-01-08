package BurgerClass;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;

    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;

    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;

    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;

    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;

    }

    public double itemizeHamburger() {
        double hamBurgerPrice = price;
        //System.out.println(name + " hamburger " + "on a " + breadRollType + " roll with " + meat + ", price is " + price);


        if (addition1Name != null) {
            hamBurgerPrice += addition1Price;
        }
        if (addition2Name != null) {
            hamBurgerPrice += addition2Price;
        }
        if (addition3Name != null) {
            hamBurgerPrice += addition3Price;
        }
        if (addition4Name != null) {
            hamBurgerPrice += addition4Price;
        }


        return hamBurgerPrice;
    }
}