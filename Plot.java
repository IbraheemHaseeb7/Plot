public class Plot {

    Address add;
    Person per;
    Dimensions dim;

    public Plot(Address add, Person per, Dimensions dim) {
        this.add = add;
        this.per = per;
        this.dim = dim;
    }

    public String getUserData() {
        return String.format("Name: %s %s\nAge: %d\nCNIC: %d\nPhone Number: %d", per.fname, per.lname, per.age, per.getCNIC(), per.getPhoneNumber());
    }
    
    // public String getAddress() {
    //     return String.format();
        
    // }
    
    // public String getDimensions() {
    //     return String.format();
        
    // }
    
    // public String getAllData() {
    //     return String.format();
    // }
}