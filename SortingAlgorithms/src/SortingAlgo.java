
public class SortingAlgo {

	public static void main(String[] args) {
		
		int arr[]={6,3,5,1,8,2};
		
		System.out.println("Pre-sorting...");
		display(arr);
		
	//	System.out.println("\n\nAfter sorting...");
	//	insertionSort(arr);
	//	display(arr);
		
		System.out.println("\n\nAfter sorting in Decreasing order...");
		revInsertionSort(arr);
		display(arr);
		
	}
	//end of main()
	
	//sorting function
	public static int[] insertionSort(int arr[]){
		int i,j,key;
		for(j=1; j<arr.length; j++){
			key=arr[j];
			i=j-1;
			while(i>=0 && arr[i]>key){
				arr[i+1]=arr[i];
				i=i-1;
			}
			arr[i+1]=key;
		}
		return arr;
	}
	// decreasing sort
	public static int[] revInsertionSort(int arr[]){
		int i,j,key;
		for(j=1;j<arr.length;j++){
			key=arr[j];
			i=j-1;
			while(i>=0 && arr[i]<key){
				arr[i+1]=arr[i];
				i=i-1;
			}
			arr[i+1]=key;
		}
		return arr;
	}
	
	//display the sorted array
	public static void display(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
