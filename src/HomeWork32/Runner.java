package HomeWork32;

public class Runner {
    public static void main(String[] args) {
        Stock stock = new Stock(10);
        Workers workers1 = new Workers();
        Workers workers2 = new Workers();
        Workers workers3 = new Workers();

        workers1.takeVodka(stock);
        workers2.takeVodka(stock);
        workers3.takeVodka(stock);
        System.out.println("-----------------------------------------");

        workers1.printJournal();
        workers2.printJournal();
        workers3.printJournal();
    }
}
