public class Arduino extends ElectronicItem{
    private String version;

    public Arduino(String name, String Location, int price, String description, int storageCapacity, String model, String maker, String operatingSystem, String version){
        super(name, Location, price, description, storageCapacity, model, maker, operatingSystem);

        this.version = version;
    }

    public String getVersion(){
        return version;
    }
    public void setVersion(String version){
        this.version = version;
    }

    @Override
    public String toString() {
        return "Arduino{" + super.toString() + ", version='" + version + "'}";
    }
}
