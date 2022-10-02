package staticDemo;

public class ProductValidator {
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void bisey() {

	}

	// inner class-------- Günümüzde pek yaygın değil çünkü Solid e uymuyor..
	public static class BaskaBirClass {
		public static void sil() {

		}
	}

}

