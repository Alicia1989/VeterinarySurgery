



public class Animal {
    
    //Two variables, one is for the type of animal and the other one fro the register.
    private String animalType;
    private String dateOfRegistration;
    
    // A constructor for when we create an object for the animal class, the constructor is created.
    public Animal(String animalType, String dateOfRegistration)
    {
        this.animalType = animalType;
        this.dateOfRegistration = dateOfRegistration;
    }
    // Getters on this secction that help to get the value of the variable when is private.
    public String getAnimalType()
    {
        return this.animalType;
    }
        public String getRegistrationDate()
    {
        return this.dateOfRegistration;
    }
}
