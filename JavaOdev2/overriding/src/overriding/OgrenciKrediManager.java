package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {   //BaseKrediManagerda ki methodu ezdik..overriding
		return tutar * 1.10;
	}

}
