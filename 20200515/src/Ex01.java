class ArrayCalu{
	public static void addOneArr(int[] arr,int add) {
		for(int i=0;i<arr.length;i++) {
			arr[i] += add;
		}
	}
	public static void addTwoArr(int[][] arr,int add) {
		for(int i=0;i<arr.length;i++) {
			addOneArr(arr[i],add);
		}
	}
	public static void doPrint(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayCalu ac = new ArrayCalu();
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		ac.doPrint(arr);
		ac.addTwoArr(arr, 3);
		ac.doPrint(arr);
		
	}

}
