import java.lang.Math;

public class CitizenHealth {
    private int calories;
    private int vitaminLevel;
    private int proteinLevel;
    private int healthcareLevel;
    private int workIntensity;
    private int age;
    private boolean mortalityEvent;
    private int overallHealth;

    public CitizenHealth(int calories, int vitaminLevel, int proteinLevel, int healthcareLevel, int workIntensity, int age, boolean mortalityEvent, int overallHealth) {
        this.calories = calories;
        this.vitaminLevel = vitaminLevel;
        this.proteinLevel = proteinLevel;
        this.healthcareLevel = healthcareLevel;
        this.workIntensity = workIntensity;
        this.age = age;
        this.mortalityEvent = mortalityEvent;
        this.overallHealth = overallHealth;
    }

    /*
     * bulk getters
     */
    public int getCalories() {
        return this.calories;
    }

    public int getVitaminLevel() {
        return this.vitaminLevel;
    }

    public int getProteinLevel() {
        return this.proteinLevel;
    }

    public int getHealthcareLevel() {
        return this.healthcareLevel;
    }

    public int getWorkIntensity() {
        return this.workIntensity;
    }

    public int getAge() {
        return this.age;
    }

    public boolean getMortalityEvent() {
        return this.mortalityEvent;
    }

    public int overallHealth() {
        return this.overallHealth;
    }

    /*
     * bulk setters
     */
    public void setCalories(int citCal) {
        this.calories = citCal;
    }

    public void setVitaminLevel(int citVit) {
        this.vitaminLevel = citVit;
    }

    public void setProteinLevel(int citProt) {
        this.proteinLevel = citProt;
    }

    public void setWorkIntensity(int citWor) {
        this.workIntensity = citWor;
    }

    public void setAge(int citAge) {
        this.age = citAge;
    }

    public void setMortalityEvent(boolean citMort) {
        this.mortalityEvent = citMort;
    }

    public void setOverallHealth(int citOver) {
        this.overallHealth = citOver;
    }

    /*
     * age calculator
     */
    public void ageCalculator(float gameYear, Citizen cit) {
        float floatage = gameYear - cit.getBirthdate();
        floatage = Math.round(floatage);
        int intage = (int)floatage;
        this.age = intage;
    }

    /*
     * overall health calculator, subject to change
     */
    public void healthCalculator(float gameYear, Citizen cit) {
        if (this.mortalityEvent) {
            this.overallHealth = -999;
        }
        ageCalculator(gameYear, cit);
        if (this.age < 30) {
            if (this.proteinLevel >= 25) {

            }
            
            if (this.vitaminLevel >= 50) {
    
            }
        }

        int prot = 0;
        int vit = 0;

        if (this.proteinLevel >= 50) {
            prot = 0;
        } else {
            double protcalc = Math.log(this.proteinLevel);
            Math.pow(protcalc, -1);
        }
        
        if (this.vitaminLevel >= 100) {
            vit = 0;
        } else {
            double vitcalc = Math.log(this.vitaminLevel);
            Math.pow(vitcalc, -1);
        }

        this.overallHealth = (int)(1000 - (this.age * 10 + prot * 50 + vit * 80 + Math.abs(2300 - this.calories) * 30));
    }

}
