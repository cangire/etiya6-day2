public class Product {
    public  Product(int id,String name,String description,double price,int stockAmount,String renk){
        System.out.println("Yapıcı blok çalıştı");
this._id=id;
this._renk=renk;
this._name=name;
this._description=description;
this._price=price;
this._stockAmount=stockAmount;
    }
    //overloading
    public Product(){

    }
    //attiribute | field
    //class publicse içindekiler public
    //private sadece tanımlandığı blokta geçerli.-süslü parantezin içinde.
    //profesyonel çalışöada böyle public tanımlanmaz.
//get çağırmaya set değeri kurmaya vermeye
   private int _id;
 private    String _name;
  private   String _description;
  private   double _price;
   private int _stockAmount;
    private String _renk;
  private String _kodu;


  //getter
    public int getId(){
        return _id;
    }
    //setter
    public void setId(int id){
        _id=id;
        //this bu class demektir.
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
       _name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        _description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
       _price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int stockAmount) {
        _stockAmount = _stockAmount;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String renk) {
        _renk = _renk;
    }

    public String get_kodu() {
        return this._name.substring(0,1) +_id;
    }

}
