import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Sample pin data (assuming data is retrieved from elsewhere)
        List<Pin> pins = new ArrayList<>();
        pins.add(new ProxyPin("image1.jpg", "Pin Title 1", "Pin Description 1"));
        pins.add(new ProxyPin("image2.jpg", "Pin Title 2", "Pin Description 2"));
        pins.add(new ProxyPin("image3.jpg", "Pin Title 3", "Pin Description 3"));

        // Create and display feed
        Feed feed = new Feed(pins);
        feed.displayPins();
    }
}
