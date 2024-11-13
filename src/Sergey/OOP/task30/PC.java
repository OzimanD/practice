package Sergey.OOP.task30;

public class PC {
    private String name;
    private int gz;
    private int ram;
    private boolean rom;
    private double price;

    public PC(String name, int gz, int ram, boolean rom, double price) {
        this.name = name;
        this.gz = gz;
        this.ram = ram;
        this.rom = rom;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGz() {
        return gz;
    }

    public void setGz(int gz) {
        this.gz = gz;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isRom() {
        return rom;
    }

    public void setRom(boolean rom) {
        this.rom = rom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PC{" +
                "name='" + name + '\'' +
                ", gz=" + gz +
                ", ram=" + ram +
                ", rom=" + rom +
                ", price=" + price +
                '}';
    }
}
