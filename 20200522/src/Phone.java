
public interface Phone {

	public void recv();
}
interface newPhone extends Phone{
	public void send();
	default public void internet() { //default 는 인터페이스라도 안에 내용을 추가할 수 있어서 재정의 안해도 문제가 안생길수있다.
		System.out.println("인터넷 할 수 있따");
	}
	static public void kakao() {
		System.out.println("카카오 할 수 있다");
	}
}