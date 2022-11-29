package HomeWork32;

public class Workers {
    int spoiledVodka = 0;
    String name;

    public Workers(String name) {
        this.name = name;
    }

    public int getSpoiledVodka() {
        return spoiledVodka;
    }

    public void setSpoiledVodka(int spoiledVodka) {
        this.spoiledVodka = spoiledVodka;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Workers(String name, int spoiledVodka) {
        this.name = name;
        this.spoiledVodka = spoiledVodka;

    }
}
