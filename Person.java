public class Person {
    String fname, lname;
    private long phoneNumber, cnic;
    byte age;

    public Person(String fname, String lname, long phoneNumber, long cnic, byte age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public void setCnicAndPhoneNumber(long ph, long cnic) {
        this.cnic = cnic;
        phoneNumber = ph;
    }

    public long getCNIC() {
        return this.cnic;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }
}
