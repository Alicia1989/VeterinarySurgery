
// Its extends from animal class so we dont have to write the variables again.
public class Pet extends Animal {
// This are the properties of the class Pet.
    private String petName;
    private String petGender;
    private int petAge;
    private String petColor;
    private String illness;

    //Constructor as the same name of the class
    public Pet(String petName, String petGender, int petAge, String petColor, String illness, String animalType, String dateOfRegistration) {
        //On the super class we include animalType, dateOfRegistration to call the animal class and execute it.
        super(animalType, dateOfRegistration);
        this.petAge = petAge;
        this.petName = petName;
        this.petGender = petGender;
        this.illness = illness;
        this.petColor = petColor;
    }

    //List of Setters 
    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setGender(String petGender) {
        this.petGender = petGender;
    }

    public void setAge(int petAge) {
        this.petAge = petAge;
    }

    public void setPetColor(String petColor) {
        this.petColor = petColor;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    //List of Getters
    public String getPetName() {
        return this.petName;
    }

    public String getPetGender() {
        return this.petGender;
    }

    public int getPetAge() {
        return this.petAge;
    }

    public String getPetColor() {
        return this.petColor;
    }

    public String getIllness() {
        return this.illness;
    }
    //This class helps to get the values of the classes
    public String getData() {
      
        
        String data = "Animal Type: " + getAnimalType()
                +"\n"
                + " Date: " + getRegistrationDate()
                 +"\n"
                + " Name: " + petName
                 +"\n"
                + " Gender: " + petGender
                 +"\n"
                + " Age: " + petAge
                 +"\n"
                + " Color: " + petColor
                 +"\n"
                + " Illness: " + illness;

        return data;
    }

}
