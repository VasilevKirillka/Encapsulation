public class Cargo {
    private final Dimensions dimensions;
    private final int weight;
    private final String address;
    private final String rotate; // вращать
    private final String number;
    private final String fragile; //хрупкий


    public Cargo(Dimensions dimensions, int weight, String address, String rotate, String number, String fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.rotate =rotate;
        this.number = number;
        this.fragile = fragile;
    }


    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public String getRotate() {
        return rotate;
    }

    public String getNumber() {
        return number;
    }


    public String getFragile() {
        return fragile;
    }


    public String toString(){
        return "Масса: " + weight + "\nГабариты: " + dimensions + "\nАдрес: " + address +
                "\nВращать груз: " + rotate + "\nНомер груза: " + number +
                "\nХрупкий груз: " + fragile;}
    }


