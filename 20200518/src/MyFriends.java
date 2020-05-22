class Friend{
	private String name;
	private String phone;
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public void showInfo() {
		System.out.println("이름 = "+this.name);
		System.out.println("번호= "+this.phone);
	}
	
}
class UniFriend extends Friend{
	private String major;
	public UniFriend(String name, String major, String phone) {
		super(name,phone);
		this.major = major;
		
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 = "+this.major);
	}
	
}
class ComFriend extends Friend{
	private String department;
	public ComFriend(String name, String department, String phone) {
		super(name, phone);
		this.department = department;
		
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("부서 = "+this.department);
	}
}
public class MyFriends {

	public static void main(String[] args) {
		
		Friend[] fri = new Friend[10];
		int fcnt = 0;
		fri[fcnt++] = new UniFriend("a1","b1","010-1234-5678");
		fri[fcnt++] = new UniFriend("a2","b2","010-1124-5578");
		fri[fcnt++] = new UniFriend("a3","b3","010-2314-4578");
		fri[fcnt++] = new UniFriend("a4","b4","010-6512-7364");
		
		for(int i=0;i<fcnt;i++) {
			fri[i].showInfo();
		}
		
//		UniFriend[] unif =new UniFriend[5];
//		int ucnt = 0;
//		ComFriend[] comf = new ComFriend[5];
//		int ccnt = 0;
//		
//		unif[ucnt++] = new UniFriend("홍길동","컴공","01012345678");
//		unif[ucnt++] = new UniFriend("김길동","화공","01052345281");
//		
//		for(UniFriend uni : unif) {
//			if(uni!=null) {
//				uni.showInfo();
//			}
//		}
//		
//		for(ComFriend com : comf) {
//			if(com != null) {
//				com.showInfo();
//			}
//			
//		}
	}

}
