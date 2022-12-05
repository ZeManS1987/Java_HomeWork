package HomeWork32;

public class Workers {
    private int spoiledVodka = 0;

    public Workers(){

    }

    public Workers(int spoiledVodka) {
        this.spoiledVodka = spoiledVodka;
    }

    public int getSpoiledVodka() {
        return spoiledVodka;
    }

    public void setSpoiledVodka(int spoiledVodka) {
        this.spoiledVodka = spoiledVodka;
    }
    public void takeVodka(Stock stock) {
        stock.takeProduct();
        System.out.println("Ура я испортил водку!");
        spoiledVodka++;
    }

    public void printJournal() {
        System.out.println(spoiledVodka);
    }
}
