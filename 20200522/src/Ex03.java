
public class Ex03 {

	Ex03(){
		myInter mt = new myInter() {
			@Override
			public void doA() {
				// TODO Auto-generated method stub
				System.out.println("mt 인터페이스");
			}
		};
		
		doUseMyInter(new myInter() {
			@Override
			public void doA() {
				// TODO Auto-generated method stub
				System.out.println("익명 인터페이스");
			}			
		});
		
		doUseMyInter(mt);
		doUseMyInter( ()->{ System.out.println("람다 인터페이스"); } );
	}
	public void doUseMyInter(myInter myinter) {
		myinter.doA();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex03();
	}

}
