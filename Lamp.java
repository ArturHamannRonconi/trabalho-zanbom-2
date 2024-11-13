public class Lamp {
    private String brand, voltage, type, model, color, warranty;
    private double price;
    private boolean isOn;

    public Lamp(String brand, String voltage, String type, String model, String color, double price, String warranty) {
        this.brand = brand;
        this.voltage = voltage;
        this.type = type;
        this.model = model;
        this.color = color;
        this.price = price;
        this.warranty = warranty;
        this.isOn = false;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getVoltage() { return voltage; }
    public void setVoltage(String voltage) { this.voltage = voltage; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getWarranty() { return warranty; }
    public void setWarranty(String warranty) { this.warranty = warranty; }
    public boolean isOn() { return isOn; }

    public void turnOn() { isOn = true; }
    public void turnOff() { isOn = false; }
    public void toggleStatus() { isOn = !isOn; }
    
    public String showStatus() {
        return isOn ? "Lamp is On" : "Lamp is Off";
    }
    
    public static void main(String[] args) {
        Lamp lamp = new Lamp("Phillips", "100V", "LED", "P5589L18", "Yellow", 25.00, "24 months");
        System.out.println("Lamp Status: " + lamp.showStatus());
        lamp.turnOn();
        System.out.println("Lamp Status: " + lamp.showStatus());
        lamp.toggleStatus();
        System.out.println("Lamp Status: " + lamp.showStatus());
    }
}