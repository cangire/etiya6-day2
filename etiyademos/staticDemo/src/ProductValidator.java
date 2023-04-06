public class ProductValidator {//ana class static olamaz.
    static {
        System.out.println("Static yapıcı blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı"); //newlersek çalışır.static yapıcı bloklar kullanılırsa newlenmeden çalışır.
    }
    public static boolean isValid(Product product){ //kullan bırak araçlar static yapılabilir sıfırlanmıyor.
if(product.price>0 && !product.name.isEmpty()){
    return true;
}
else{
    return false;
}


    }
    //inner class
    public static class BaskaBirClass{
        public static void Sil(){

        }
    }

}
