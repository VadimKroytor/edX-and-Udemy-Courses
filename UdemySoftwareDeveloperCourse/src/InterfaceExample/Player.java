package InterfaceExample;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        weapon = "Sword";
    }

    public List<String> write() {
        List<String> l = new ArrayList<>();
        l.add(name);
        l.add(String.valueOf(hitPoints));
        l.add(String.valueOf(strength));
        l.add(weapon);
        return l;
    }

    public void read(List<String> l) {
        if (l.size() > 0 && l != null) {
            name = l.get(0);
            hitPoints = Integer.parseInt(l.get(1));
            strength = Integer.parseInt(l.get(2));
            weapon = l.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', hitPoints=" +
                hitPoints + ", strength=" + strength +
                ", weapon='" + weapon + "'}";
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
}
