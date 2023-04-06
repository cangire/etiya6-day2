public class Main {
    public static void main(String[] args) {
       //referans tiplerinin birbirinin referansını tutabilmesi.
BaseLogger[] baseLoggers=new BaseLogger[]{new FileLogger(),new DatabaseLogger(),new EmailLogger(),new ConsoleLogger()};
for(BaseLogger logger : baseLoggers){
    logger.log("Log mesajı");

}
CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
customerManager.add();
    }
}