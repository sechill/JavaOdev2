package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
//		EmailLogger logger=new EmailLogger();
//		logger.log("Log mesajı");
		
		//Her biri farklı iş yapan ama hepsinin baselogger olduğu bir dizi..
//		BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//		for(BaseLogger logger:loggers) {
//			logger.log("Log mesajı");
//		}
		
		
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();

	}

}
