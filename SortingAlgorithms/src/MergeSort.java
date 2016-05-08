
public class MergeSort {

	public static void main(String[] args) {
		
		int arr[]={3,2,11,2,76,6,0,-4};
		System.out.println("Pre sorted...");
		display(arr);
		
		System.out.println("\nAfter sorted...");
		mergeSort(arr, 1, arr.length);
		display(arr);

	}
	
	public static int[] mergeSort(int A[], int p, int r){
		
		if (p<r){
			int q=(p+r)/2;
			mergeSort(A,p,q);
			mergeSort(A,q+1,r);
			merge(A,p,q,r);
		}
		return A;
		
	}
	//function for Merge Sort
	public static int[] merge(int A[], int p, int q, int r){
		int n1=q-p+1;
		int n2=r-q;
		int L[] =new int[n1+1];
		int R[]=new int[n2+1];
		int i,j;
		for (i=0;i<n1;i++)
			L[i]=A[p+i-1];
		for (j=0;j<n2;j++)
			R[j]=A[q+j];
		
		L[n1]=R[n2]=999999;//sentinel
		i=j=0;
		for (int k=p-1; k<r; k++){
			if (L[i]<=R[j])
				{if(L[i]==999999)
					break;
					A[k]=L[i];i++;
					}
			else if(R[j]!=999999)
				{A[k]=R[j];j++;}
				
		}
		return A;
	}
	//display the sorted array
	public static void display(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}


}
