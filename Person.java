public class Person {
    String fname, lname;
    int phoneNumber, cnic;
    byte age;

    public Person(String fname, String lname, int phoneNumber, int cnic, byte age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.cnic = cnic;
        this.phoneNumber = phoneNumber;
    }

    public void setCnicAndPhoneNumber(int ph, int cnic) {
        this.cnic = cnic;
        this.phoneNumber = ph;
    }

    public int getCNIC() {
        return this.cnic;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getUserData() {
        return String.format("Name: %s %s\nAge: %d\nCNIC: %d\nPhone Number: %d", fname, lname, age, getCNIC(), getPhoneNumber());
    }
}
