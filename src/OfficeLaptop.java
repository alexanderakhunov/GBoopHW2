public class OfficeLaptop extends Laptop {

    public OfficeLaptop(int RAM, int capacityHardDisk, String OS, String color) {
        super.RAM = RAM;
        super.capacityHardDisk = capacityHardDisk;
        super.OS = OS;
        super.color = color;
    }

    @Override
    public int getRAM() {
        return RAM;
    }

    @Override
    public void setRAM(int RAM) {
        super.RAM = RAM;
    }

    @Override
    public int getCapacityHardDisk() {
        return capacityHardDisk;
    }

    @Override
    public void setCapacityHardDisk(int capacityHardDisk) {
        super.capacityHardDisk = capacityHardDisk;
    }

    @Override
    public String getOS() {
        return OS;
    }

    @Override
    public void setOS(String OS) {
        super.OS = OS;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        super.color = color;
    }

    @Override
    public String toString() {
        return "OfficeLaptop{" +
                "RAM=" + RAM +
                ", capacityHardDisk=" + capacityHardDisk +
                ", OS='" + OS + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

