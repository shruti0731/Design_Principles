package items;

public class CD implements LibraryItem {

    String title;
    public String uniqueId;
    String artist;
    double value;

    public CD(String title, String uniqueId, String artist, double value) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.artist = artist;
        this.value = value;
    }

    @Override
    public double calculateLateFee(int days) {
        return days*20;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public String getUniqueId() {
        return this.uniqueId;
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
