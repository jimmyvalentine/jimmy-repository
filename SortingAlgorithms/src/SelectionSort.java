

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[]={3,2,4,5,11,5,34,2,76,92,7,6,0,1,-4};
		

		selectionSort(arr);
		display(arr);
		
	}
	//end of main()
	
	//function that perform Selection Sort
	
	public static int[] selectionSort(int arr[]){
		int key,j,idx=0;
		for(int i=0; i<arr.length-1; i++){
			key=arr[i];
			int flag=0;
						
			for(j=i+1; j<arr.length; j++){
				if(arr[j]<key){
					idx=j;
					key=arr[j];
					flag=1;
				}
				
			}
			if (flag==1)
			swap(arr,idx,i);
		}
		return arr;
	}
	
	//function to swap array elements
	public static int[] swap(int arr[],int a, int b){
		int temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		return arr;
	}
	
	//display the sorted array
	public static void display(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
