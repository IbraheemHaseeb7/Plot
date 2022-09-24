public class Driver {
    public static void main(String[] args) {

        Plot demoPlot = new Plot(new Address(10, 2, "C", "Lahore"), new Person("Ibraheem", "Haseeb", 1281, 12123, (byte)19), new Dimensions(10, 10, 10));

        System.out.printf(demoPlot.dim.getDimensions());
    }
}
