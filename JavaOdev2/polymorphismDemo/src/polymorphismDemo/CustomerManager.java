package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger=logger;
	}
	public void add() {
		System.out.println("Müşteri eklendi");
		this.logger.log("Log mesajı");
		
//		DatabaseLogger logger=new DatabaseLogger();   Burası DatabaseLogger a bağımlı oldu
//		logger.Log("Log mesajı");
	}

}
