public abstract class Laptop {
    protected int RAM;
    protected int capacityHardDisk;
    protected String OS;
    protected String color;

    public abstract int getRAM();
    public abstract void setRAM(int RAM);
    public abstract int getCapacityHardDisk();
    public abstract void setCapacityHardDisk(int capacityHardDisk);
    public abstract String getOS();
    public abstract void setOS(String OS);
    public abstract String getColor();
    public abstract void setColor(String color);

    public abstract String toString();
}
