
public class Exam {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[][] {
			{11,22,33},
			{44,55,66},
			{77,88,99}
		};
		
		addTwoDArr(arr,3);
		System.out.println();
		changeArr(arr);
		
		int[][] exam2 = new int[][] {
			{1,2,3,4,5},
			{6,7,8,9,10},
			{11,12,13,14,15},
			{16,17,18,19,20},
			{21,22,23,24,25},
			{26,27,28,29,30}
		};
		System.out.println();
		changeArr(exam2);
	}

	public static void addOneDArr(int[] arr,int add) {
		for(int i=0;i<arr.length;i++) {
			arr[i]+=add;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}
	public static void addTwoDArr(int [][]arr, int add) {
		int size=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				size++;
			}	
		}
		int array[]=new int[size];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				array[k]=arr[i][j];
				k++;
			}
		}
		addOneDArr(array,add);
	}
	public static void changeArr(int[][] arr) {
		int[] swap1 = new int[arr[0].length];
		int[] swap2 = new int[arr[0].length];
		int[] start = new int[arr[0].length];
		start = arr[arr.length-1];

		for(int i=0;i<arr.length;i++) {
			if(i!=arr.length-1) {
				if(i==0) {
					swap2 = arr[0];
				}
				swap1 = swap2;
				swap2 = arr[i+1];
				arr[i+1]=swap1;
				
			}
			else {
				arr[0]=start;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
}
