import java.util.List;

public class Feed {

    private List<Pin> pins;

    public Feed(List<Pin> pins) {
        this.pins = pins;
    }

    public void displayPins() {
        for (Pin pin : pins) {
            pin.displayPin(); // Uses ProxyPin or RealPin based on download state
        }
    }
}
