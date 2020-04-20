/*
 * 자연수 1부터 시작해서 모든 홀수를 더해 나간다. 그리고 그 합이 언제(몇을 더했을 때) 1000을 넘어서는지, 그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력
 */
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=1;
		int sum=0;
		
		while (true) {

			sum += count;
			if (sum > 1000) {
				System.out.println("count = " + count);
				System.out.println("sum = " + sum);
				break;
			}

			count = count + 2;
		}
	}

}
