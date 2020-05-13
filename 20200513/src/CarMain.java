
public class CarMain {

	public CarMain() {
		GiaCar gc = new GiaCar();
		gc.name="K5";
		gc.tellInfo();
		
		SsangyongCar sc = new SsangyongCar();
		sc.name="코란도C";
		sc.tellInfo();
		
		SamsungCar ss = new SamsungCar();
		ss.name = "QM6";
		ss.tellInfo();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CarMain();
	}

}
