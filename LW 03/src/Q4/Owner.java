package Q4;

public class Owner {
    private String ownerName;
    private String ownerPoneNumber;

    public Owner() {
        this.ownerName = "NULL";
        this.ownerPoneNumber = "NULL";

    }
    public Owner(String ownerName, String ownerPoneNumber){
        this.ownerName = ownerName;
        this.ownerPoneNumber = ownerPoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerPoneNumber() {
        return ownerPoneNumber;
    }
    public void setOwnerName(String OwnerName){
        this.ownerName = ownerName;

    }

    public void setOwnerPoneNumber(String ownerPoneNumber) {
        this.ownerPoneNumber = ownerPoneNumber;
    }
}
