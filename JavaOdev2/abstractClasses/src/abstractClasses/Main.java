package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator =new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		//GameCalculator gameCalculator=new GameCalculator();
		//Abstract classlar newlenemez.İçinde ki metodlar yazılırsa olur ama güzel yöntem değil
		
		
		GameCalculator gameCalculator=new WomanGameCalculator();

	}

}

