package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator=new ProductValidator();
		//if(validator.isValid(product)) {   
		if(ProductValidator.isValid(product)) { //metod static olduğu için class ismiyle cağrılıyor..
		System.out.println("Eklendi");
	}else {
		System.out.println("Ürün bilgileri geçersizdir.");
	}

		ProductValidator validator=new ProductValidator();
		validator.bisey();   //metod static olmadığından direk class ismiyle çağırılamaz,newlenecek
}
	
	
	
}