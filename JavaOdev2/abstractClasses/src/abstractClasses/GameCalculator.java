package abstractClasses;

public abstract class GameCalculator {
//	public void hesapla() {         
//		System.out.println("Puanınız : 100");
//	}//ya düz class da bu şekil overriding yaparız yada tüm classlar değişecekse 
	//abstract class yapıp her classda override yaparız..
	
	public abstract void hesapla();
	
	public final void gameOver() { //hiçbir class da değiştirelemez..
		
	}

}
