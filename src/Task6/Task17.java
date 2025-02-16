package Task6;
import java.util.ArrayList;
import java.util.List;

interface Souvenir {
    void viewSupplier();
    void createLayout();
    void editLayout();
    void signContract();
    void terminateContract();
    void payForSouvenir();
    void rejectSouvenir();
    void produceSouvenir();
    void removeSouvenir();
}

class Notebook implements Souvenir {
    public void viewSupplier() { System.out.println("Просмотр поставщика блокнотов."); }
    public void createLayout() { System.out.println("Создание макета блокнота."); }
    public void editLayout() { System.out.println("Редактирование макета блокнота."); }
    public void signContract() { System.out.println("Оформление договора на блокнот."); }
    public void terminateContract() { System.out.println("Расторжение договора на блокнот."); }
    public void payForSouvenir() { System.out.println("Оплата блокнота."); }
    public void rejectSouvenir() { System.out.println("Отказ от блокнота."); }
    public void produceSouvenir() { System.out.println("Производство блокнота."); }
    public void removeSouvenir() { System.out.println("Удаление блокнота."); }
}

class TShirt implements Souvenir {
    public void viewSupplier() { System.out.println("Просмотр поставщика майки."); }
    public void createLayout() { System.out.println("Создание макета майки."); }
    public void editLayout() { System.out.println("Редактирование макета майки."); }
    public void signContract() { System.out.println("Оформление договора на майку."); }
    public void terminateContract() { System.out.println("Расторжение договора на майку."); }
    public void payForSouvenir() { System.out.println("Оплата майки."); }
    public void rejectSouvenir() { System.out.println("Отказ от майки."); }
    public void produceSouvenir() { System.out.println("Производство майки."); }
    public void removeSouvenir() { System.out.println("Удаление майки."); }
}

class Magnet implements Souvenir {
    public void viewSupplier() { System.out.println("Просмотр поставщика магнита."); }
    public void createLayout() { System.out.println("Создание макета магнита."); }
    public void editLayout() { System.out.println("Редактирование макета магнита."); }
    public void signContract() { System.out.println("Оформление договора на магнит."); }
    public void terminateContract() { System.out.println("Расторжение договора на магнит."); }
    public void payForSouvenir() { System.out.println("Оплата магнита."); }
    public void rejectSouvenir() { System.out.println("Отказ от магнита."); }
    public void produceSouvenir() { System.out.println("Производство магнита."); }
    public void removeSouvenir() { System.out.println("Удаление магнита."); }
}

