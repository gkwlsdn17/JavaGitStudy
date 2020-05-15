
public class Ex02 {

	private int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12,13}};
	private int brr[] = null;
	Ex02(){
		int arr_length = arr.length;
		brr = new int[arr[arr_length-1].length];
		for(int i=0;i<arr[arr_length-1].length;i++) {
			brr[i]=arr[arr_length-1][i];
		}
		arr[0] = arr[arr_length-1];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex02();
		int a = 10;
	}

}
