package abstractDemo;

public class Main {

	public static void main(String[] args) {
//		OracleDatabaseManager oracleDatabaseManager=new OracleDatabaseManager();
//		oracleDatabaseManager.getData();    BÖYLE OLURSA BAĞIMLILIK OLUR..
		
//		CustomerManager customerManager=new CustomerManager();
//		customerManager.getCustomers();  BÖYLE OLURSA HATA...
//      Çünkü getCustomer()'da databaseManager için BaseDatabaseManagerı newlemek isteyecek ama
//		newlenemez çünkü o abstract class..
		
		
		//strategy pattern uygulanıyor
		CustomerManager customerManager=new CustomerManager();
		customerManager.databaseManager=new OracleDatabaseManager();
		customerManager.getCustomers();
		
		

	}
}
