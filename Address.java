public class Address {
    int houseNumber, streetNumber;
    String block, city;

    public Address(int houseNumber, int streetNumber, String block, String city) {
        this.houseNumber = houseNumber;
        this.streetNumber = streetNumber;
        this.block = block;
        this.city = city;
    }

    public String getAddress() {
        return String.format("Address: %d-%s, Street No. %d, %s", add.houseNumber, add.block, add.streetNumber, add.city);  
    }
}
