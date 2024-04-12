public class ProxyPin implements Pin {

    private String imageUrl;
    private String title;
    private String description;
    private RealPin realPin;

    public ProxyPin(String imageUrl, String title, String description) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.description = description;
    }

    @Override
    public void displayPin() {
        if (realPin == null) {
            realPin = new RealPin(imageUrl, title, description);
        }
        realPin.displayPin();
    }
}

