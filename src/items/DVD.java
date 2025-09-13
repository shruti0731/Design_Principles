package items;

public class DVD implements  LibraryItem{
    String title;
    public String uniqueId;
    String artist;
    double value;

    public DVD(String title, String uniqueId, String artist, double value) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.artist = artist;
        this.value = value;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getUniqueId() {
        return this.uniqueId;
    }

    @Override
    public double calculateLateFee(int days) {
        return days*30;
    }
    public double getValue() {
        return this.value;
    }
}
