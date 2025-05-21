public class Citizen {
    private String citizenName;
    private Citizen mother;
    private Citizen father;
    private float birthdate;
    private int gametileRho;
    private int gametilePhi;
    private int happiness;
    private boolean forerunner;
    private CitizenHealth citizenHealth;

    public Citizen(String citizenName, Citizen mother, Citizen father, float birthdate, int gametileRho, int gametilePhi, int happiness, boolean forerunner, CitizenHealth citizenHealth) {
        this.citizenName = citizenName;
        this.mother = mother;
        this.father = father;
        this.birthdate = birthdate;
        this.gametileRho = gametileRho; // denoted ρ mathematically
        this.gametilePhi = gametilePhi; // denoted ϕ mathematically
        this.happiness = happiness;
        this.forerunner = forerunner;
        this.citizenHealth = citizenHealth;
    }


    /*
     * bulk getters for citizen attributes
     */
    public String getCitizenName() {
        return this.citizenName;
    }

    public Citizen getMother() {
        return this.mother;
    }

    public Citizen getFather() {
        return this.father;
    }

    public float getBirthdate() {
        return this.birthdate;
    }

    public int getgametileRho() {
        return this.gametileRho;
    }

    public int getgametilePhi() {
        return this.gametilePhi;
    }

    public int getHappyness() {
        return this.happiness;
    }

    public boolean getForerunner() {
        return this.forerunner;
    }

    public CitizenHealth citizenHealth() {
        return this.citizenHealth;
    }

    /*
     * bulk setters for citizen attributes
     */
    public void setCitizenName(String citName) {
        this.citizenName = citName;
    }

    public void setParents(Citizen citFather, Citizen citMother) {
        if (this.forerunner) {
            this.father = null;
            this.mother = null;
        }
        
        this.father = citFather;
        this.mother = citMother;
    }

    public void setBirthdate(float citbirthdate) {
        this.birthdate =  citbirthdate;
    }

    public void setCoords(int rho, int phi) {
        this.gametileRho = rho;
        this.gametilePhi = phi;
    }

    public void setHappiness(int citHappy) {
        this.happiness = citHappy;
    }

    public void setForerunner(boolean citfore) {
        this.forerunner = citfore;
    }

    public void setCitizenHealth(CitizenHealth citHealth) {
        this.citizenHealth = citHealth;
    }
}
