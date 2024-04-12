public class RealPin implements Pin {

    private String imageUrl;
    private String title;
    private String description;

    // other pin details...

    public RealPin(String imageUrl, String title, String description) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.description = description;
    }

    private void downloadImage() {
        // Simulate downloading the image from a server (could be slow)
        System.out.println("Downloading image: " + imageUrl);
    }

    @Override
    public void displayPin() {
        downloadImage();
        System.out.println("Displaying pin:");
        System.out.println("  Title: " + title);
        System.out.println("  Description: " + description);
        System.out.println("  Image: " + imageUrl);
    }
}
