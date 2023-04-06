public class Main {
    public static void main(String[] args) {
CustomerManager customerManager =new CustomerManager();
CustomerManager customerManager2=new CustomerManager();
customerManager.Add();
customerManager.Update();
customerManager.Remove();
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);
        int[]sayılar1=new int[]{1,2,3};
        int[]sayılar2=new int[]{4,5,6};
        sayılar2=sayılar1;
        sayılar1[0]=10;
        System.out.println(sayılar2[0]);
        //cevap 10 olur aynı heapte olduğu için.
    }
    //değer tipliler stackte oluşur.

}
//classlar gruplama yapar -operasyonları-methodları.

//stack(
// CM oluşur
//CM2 oluşur
//
// )-heap(burada newlenince nesne oluşur her newlendiğinde )
//eğer bir referans tutan kalmazsa garbage collector siler)

