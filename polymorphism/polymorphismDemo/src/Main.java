public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DataLogger(),new ConsoleLogger()};
//        for (BaseLogger logger:loggers) {
//            logger.Log("Log mesajı");}

        CustomerManager customerManager = new CustomerManager(new FileLogger()); //Burda filelogger kısmını eğiştirerek koddaki etkileşimde olunan her yeri değiştirmiş olabiliriz.
        customerManager.Add();

    }
}
