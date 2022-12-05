package HomeWork32;

public  class Stock {
     private int countVodka = 0;
     public Stock(){
     }

    public Stock(int countVodka) {
        this.countVodka = countVodka;
    }

    public int getCountVodka() {
        return countVodka;
    }

    public void setCountVodka(int countVodka) {
        this.countVodka = countVodka;
    }
    public void takeProduct(){
        this.countVodka--;
    }
}



