package items;

import main.LateFeeCalculate;

public interface LibraryItem extends LateFeeCalculate{
    String getTitle();
    String getUniqueId();
    double getValue();
}
