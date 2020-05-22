class LSPhone implements newPhone{

	@Override
	public void recv() {
		// TODO Auto-generated method stub
		System.out.println("전화도 받을 수 있다");
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("전화도 걸 수 있다");
	}
	
}
public class Ex05 {

	Ex05(){
		LPhone lp = new LPhone();
		lp.recv();
		SPhone sp = new SPhone();
		sp.recv();
		
		LSPhone lsp = new LSPhone();
		lsp.recv();
		lsp.send();
		
		newPhone.kakao();
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
