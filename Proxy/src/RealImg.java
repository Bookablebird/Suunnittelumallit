public class RealImg implements Image{

    private final String filename;

    public RealImg(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }
    
    private void loadImageFromDisk() {
        System.out.println("Loading:   " + filename);
    }
    
    @Override
    public void displayImage() {
        System.out.println("Displaying: " + filename);
    }

    @Override
    public void showData() {
        System.out.println("Image name: " + filename);
    }
    
}