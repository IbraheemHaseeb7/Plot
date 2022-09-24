public class Plot {

    Address add;
    Person per;
    Dimensions dim;

    public Plot(Address add, Person per, Dimensions dim) {
        this.add = add;
        this.per = per;
        this.dim = dim;
    }
    
    public String getAllData() {
        return String.format("Name: %s %s\nAge: %d\nCNIC: %d\nPhone Number: %d\n\nAddress: %d-%s, Street No. %d, %s\n\nWidth: %d\nLength: %d\nDepth: %d", per.fname, per.lname, per.age, per.getCNIC(), per.getPhoneNumber(), add.houseNumber, add.block, add.streetNumber, add.city, dim.width, dim.length, dim.depth);
    }
}