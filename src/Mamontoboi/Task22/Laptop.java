package Mamontoboi.Task22;

public class Laptop {
    private String name;
    private int freq;
    private int RAM;
    private boolean hasDVDROM;
    private int price;

    public Laptop(String name, int freq, int RAM, boolean hasDVDROM, int price) {
        this.name = name;
        this.freq = freq;
        this.RAM = RAM;
        this.hasDVDROM = hasDVDROM;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public boolean isHasDVDROM() {
        return hasDVDROM;
    }

    public void setHasDVDROM(boolean hasDVDROM) {
        this.hasDVDROM = hasDVDROM;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
