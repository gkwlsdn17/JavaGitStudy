import java.util.Scanner;

public class Ex02 {
	private Student[] stus = new Student[10];
	int count = 0;
	Scanner sc = new Scanner(System.in);
	Ex02(){
		while(true) {
			System.out.println("1.학생 입력\n2.학생출력\n3.종료");
			int select = sc.nextInt();
			if(select==1) {
				if(count==10) {
					System.out.println("입력 가능한 수를 초과했습니다.");
					continue;
				}
				//select에서 받은 엔터문제로 이름 입력이 안되는 문제 해결
				sc.nextLine();
				
				//학생입력
				System.out.println("학생 이름을 입력하세요");
				String name = sc.nextLine();
				
				System.out.println("학생 나이를 입력하세요");
				int age = sc.nextInt();
				stus[count] = new Student(name,age,count+1);
				
				System.out.println("1명의 학생을 등록했습니다.");
				count++;
			}
			else if(select == 2) {
				//학생 출력
				for(Student s:stus) {
					System.out.println(s);
				}
			}
			else{
				//종료
				break;
			}
		}
//		stus[0] = new Student("홍길동",20,1);
//		stus[1] = new Student("김길동",30,2);
//		stus[2] = new Student("이길동",40,3);
//		stus[3] = new Student("박길동",20,4);
		
//		for(int i=0;i<stus.length;i++) {
//			System.out.println("stus["+i+"] = "+stus[i]);
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex02();
	}

}
