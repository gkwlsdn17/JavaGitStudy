import java.util.Scanner;

class Human{
	int hp = 100;
	//사람이 몬스터를 공격
	void doAtt(Monster mon) {
		if(mon.hp<0) {return;}
		mon.hp = mon.hp - 3;
		System.out.println("몬스터 hp = "+mon.hp);
	}
}
class Monster{
	int hp = 100;
	//몬스터가 사람을 공격
	void doAtt(Human human) {
		if(human.hp<0) {return;}
		human.hp = human.hp - 4;
		System.out.println("사람 hp = "+human.hp);
	}
}
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Human human = new Human();
		Monster mon = new Monster();
		while(true) {
			System.out.println("무슨 행동을 하시겠습니까?");
			System.out.println("1.사람이 몬스터를 공격 \n2.몬스터가 사람을 공격\n3.종료 ");
			int select = scan.nextInt();
			switch(select) {
				case 1: 
					human.doAtt(mon);
					break;
				case 2:
					mon.doAtt(human);
					break;
				default:
					System.out.println("종료됩니다.");
					System.exit(1);
			}
		}
	}

}
