
public class Ex01 {

	Ex01(){
		int arr[] = {1,34,20,2,10,34,290,30};
		int max = arr[0];
		int min = arr[0];
		for(int i:arr) {
			if(max<i) {
				max = i;
			}
			if(min>i) {
				min = i;
			}
		}
		System.out.println("최댓값 = "+max);
		System.out.println("최솟값 = "+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex01();
	}

}
