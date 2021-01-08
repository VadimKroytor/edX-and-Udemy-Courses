package InterfaceExample;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public List<String> write() {
        List<String> l = new ArrayList<>();
        l.add(name);
        l.add(String.valueOf(hitPoints));
        l.add(String.valueOf(strength));
        return l;
    }

    public void read(List<String> l) {
        if (l.size() > 0 && l != null) {
            name = l.get(0);
            hitPoints = Integer.parseInt(l.get(1));
            strength = Integer.parseInt(l.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{name='" + name + "', hitPoints=" +
                hitPoints + ", strength=" + strength + "}";
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
}
