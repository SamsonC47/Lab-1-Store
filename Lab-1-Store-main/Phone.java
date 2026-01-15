public class Phone extends ElectronicItem{
    private String networkType;
    private int screenSize;

    public Phone(String name, String Location, int price, String description, int storageCapacity, String model, String maker, String operatingSystem, String networkType, int screenSize){
        super(name, Location, price, description, storageCapacity, model, maker, operatingSystem);

        this.networkType = networkType;
        this.screenSize = screenSize;
    }

    public String getNetworkType(){
        return networkType;
    }
    public int getScreenSize(){
        return screenSize;
    }

    public void setNetworkType(String networkType){
        this.networkType = networkType;
    }
    public void setScreenSize(int screenSize){
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone{" + super.toString() + ", networkType='" + networkType +
                "', screenSize=" + screenSize + "}";
    }
}


