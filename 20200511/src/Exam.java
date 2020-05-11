
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String num = "990925-1012999";
		num = num.replace("-", "");
		System.out.println(num);
		
		StringBuilder a=new StringBuilder(); 
		a.append(num);
		a.replace(6, 6, "");
		System.out.println(a);
		
		int[] arr = {3,4,9,1,2,0,6,7,8,5};
		System.out.println("minvalue = "+minValue(arr));
		System.out.println("maxvalue = "+maxValue(arr));
				
	}

	public static int minValue(int[] arr) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for(int temp : arr) {
			if(max<temp) {
				max = temp;
			}
		}
		return max;
	}
	
}
