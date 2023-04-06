public class Main {
    public static void main(String[] args) {
Product product=new Product(1,"Laptop","a",200,3);
product.set_name("Laptop");
product.setId(1);
product.set_description("Asus Laptop");
product.set_price(5000);
product.set_stockAmount(3);
//System.out.println(product.name);
product.setId(1);
System.out.println(product.get_kodu());
ProductManager productManager =new ProductManager();
productManager.Add(product);
        //solid e uygun yazmalıyız classları. hem attiribute tutup hem operasyonları içermemeli.
         productManager.Add2(1,"a","b",3,200);
    }

}