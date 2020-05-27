class MyRapperInteger{
	private int _int = 0;

	public MyRapperInteger(int _int) {
		super();
		this._int = _int;
	}

	@Override
	public String toString() {
		return _int + "";
	}

	public int get_int() {
		return _int;
	}

	public void set_int(int _int) {
		if(_int>2147483647) {
			System.out.println("int형 범위를 벗어나서 설정 할 수 없다.");
			this._int = 0;
			return;
		}
		else {
			this._int = _int;	
		}
		
	}
	
}
public class Ex01 {

	Ex01(){
		Integer iInst = new Integer(3);
		System.out.println(iInst.toString());
		System.out.println(iInst);
		
		Integer iInst1 = new Integer("33");
		System.out.println(iInst1.toString());
		System.out.println(iInst1);
		
		System.out.println("Integer.MAX_VALUE = "+Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE = "+Integer.MIN_VALUE);
		
		MyRapperInteger mri = new MyRapperInteger(3);
		System.out.println("mri = "+mri);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex01();
	}

}
