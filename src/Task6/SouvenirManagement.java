package Task6;

import java.util.ArrayList;
import java.util.List;

public class SouvenirManagement {
    public static void main(String[] args) {
        List<Souvenir> souvenirs = new ArrayList<>();
        souvenirs.add(new Notebook());
        souvenirs.add(new TShirt());
        souvenirs.add(new Magnet());

        for (Souvenir souvenir : souvenirs) {
            souvenir.viewSupplier();
            souvenir.createLayout();
            souvenir.signContract();
            souvenir.payForSouvenir();
            System.out.println();
        }
    }
}
