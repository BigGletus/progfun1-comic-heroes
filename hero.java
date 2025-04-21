public class Hero {
    private String name;
    private int powerLevel;
    private Affiliation affiliation;

    //constructor
    public Hero(String name, int powerLevel, Affiliation affiliation) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.affiliation = affiliation;
    }

    //getters for Name, Power Level, and Affiliation, respectively
    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }
    
    public Affiliation getAffiliation() {
        return affiliation;
    }

    //toString for object
    @Override
    public String toString() {
        return ("Name: " + name + "\nPower Level: " + powerLevel + "\nAffiliation: " + affiliation);
    }
}