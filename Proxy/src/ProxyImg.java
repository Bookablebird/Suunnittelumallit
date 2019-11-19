public class ProxyImg implements Image{
    private final String filename;
    private RealImg image;

    public ProxyImg(String filename) {
        this.filename = filename;
    }

    @Override
    public void displayImage() {
        if (image == null){
            image = new RealImg(filename);
        }
        image.displayImage();
    }

    @Override
    public void showData() {
        System.out.println("Image name: " + filename);
    }

}