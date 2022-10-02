package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	//Eğer ki basede ki bir metodun diğer classlarda ezilmesini istemiyorsak final kullanılır..
	//public final double hesapla() gibi...
}
