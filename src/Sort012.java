
public class Sort012 {

	public void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void sort(int[] arr){
		int low=0;
		int high=arr.length-1;
		int mid=0;
		
		while(mid<high){
			switch (arr[mid]) {
			case 0:
				swap(arr,low,mid);
				low++;mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(arr,mid,high);
				high--;
				break;
			default:
				break;
			}
		}
	}
	
	public void printArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Sort012 sort012 = new Sort012();
		int[] arr = {0,1,0,2,2,2,1,1,1,0,0,2,2};
		sort012.sort(arr);
		sort012.printArr(arr);
	}
	
}
