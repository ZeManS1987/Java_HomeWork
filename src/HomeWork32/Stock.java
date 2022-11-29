package HomeWork32;

public  class Stock {
    static int vodka = 9;

    public static void main(String[] args) {
        WorkersExample();
    }

    public static void WorkersExample() {
        Workers yura = new Workers("Yura", 0);
        Workers sasha = new Workers("Sasha", 0);
        Workers koly = new Workers("Koly", 0);

        for (int i = Stock.vodka; i >0 ; i--) {
            Workers[] name = {yura, sasha, koly};
            int rand = (int)(Math.random() * name.length);
            name[rand].spoiledVodka++;
            Stock.vodka--;

            System.out.println("Ура я испортил водку!");
            System.out.println("Остаток на складе " + Stock.vodka);
            System.out.println("Работник " + name[rand].getName() + " , испортил всего " + name[rand].getSpoiledVodka() + " бут. водки");
            System.out.println("--------------------------------------------------------");

        }
    }

    public Stock(int vodka) {
        this.vodka = vodka;
    }

    public int getVodka() {
        return vodka;
    }

    public void setVodka(int vodka) {
        this.vodka = vodka;
    }
}
