package Q4;

public class Bicycle {
    private Owner owner;

    public Bicycle(){
        owner = new Owner("NULL","NULL");


    }

    public Bicycle(String ownerName, String ownerPhoneNumber){
        owner = new Owner(ownerName, ownerPhoneNumber);
    }

    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    public void setOwnerName(String ownerName) {
        this.owner.setOwnerName(ownerName);
    }
    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.owner.setOwnerPoneNumber(ownerPhoneNumber);
    }
    public String getOwnerName() {
        return owner.getOwnerName();
    }
    public String getOwnerPhoneNumber() {
        return owner.getOwnerPoneNumber();
    }
}
