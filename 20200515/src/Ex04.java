class Car{
	protected String number;

	public Car(String number) {
		this.number = number;
	}
	public void answer() {
		System.out.println("안녕 내 차번호는 "+number);
	}
	
}
class ElecCar extends Car{
	private String carver;
	public ElecCar(String number,String carver) {
		super(number);
		this.carver = carver;
	}
	public void dirveCar() {
		System.out.println("자동차가 운전"+carver);
	}
	
}

public class Ex04 {

	Ex04(){
		ElecCar ec = new ElecCar("72러2233","최신버전");
		ec.dirveCar();
		ec.answer();
		Car car = new Car("11");
		
		Car car1 = new ElecCar("aaa","버전");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex04();
	}

}
