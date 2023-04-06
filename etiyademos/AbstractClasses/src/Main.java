public class Main {
    public static void main(String[] args) {
WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
womanGameCalculator.hesapla();
womanGameCalculator.gameOver();

//abstract sınıflar newlenemez new lenmeye çalışılırsa içindeki methodlar doldurulmalı.
        GameCalculator gameCalculator=new WomanGameCalculator();

    }
}