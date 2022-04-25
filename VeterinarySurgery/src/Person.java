//This class is to get the information about the pet ownwer, 
public class Person {

    private String ownerName;
    private String ownerAddress;

    //setters
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    //Getters
    public String getOwnerName() {
        return this.ownerName;
    }

    public String getOwnerAddress() {
        return this.ownerAddress;
    }

    public String getData() {
        String data = "Owner Name: " + ownerName
             
                + " Address: " + ownerAddress;
        return data;
    }
}
