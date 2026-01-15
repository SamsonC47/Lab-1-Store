public class ElectronicItem extends CISItem{
    private int storageCapacity;
    private String model;
    private String maker;
    private String operatingSystem;

    public ElectronicItem(String name, String Location, int price, String description, int storageCapacity, String model, String maker, String operatingSystem){
        super(name, Location, price, description);

        this.storageCapacity = storageCapacity;
        this.model = model;
        this.maker= maker;
        this.operatingSystem = operatingSystem;
    }

    public String getModel(){
        return model;
    }
    public String getMaker(){
        return maker;
    }
    public String getOperatingSystem(){
        return operatingSystem;
    }
    public int getStorageCapacity(){
        return storageCapacity;
    }

    public void setModel(String model){
        this.model = model;
    }
    public void setMaker(String maker){
        this.maker = maker;
    }
    public void setStorageCapacity(int storageCapacity){
        this.storageCapacity = storageCapacity;
    }
    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return super.toString() + ", storageCapacity=" + storageCapacity +
                ", model='" + model + "', maker='" + maker +
                "', operatingSystem='" + operatingSystem + "'";
    }
}
