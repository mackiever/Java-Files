public class SelectionSort {

	public static void main(String[] args) {
	int myarray[] = {45,100,30,90,40,80,50};
	sorting(myarray,7);
	
	}
	public static int sorting(int a[],int lim){
		int min,i,j,temp = 0;
		
		for(i = 0;i < lim-1; i++){
			min = i;
			for(j=i + 1; j < lim; j++){
				if( a[i] > a[j])
				temp = a[min];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		for (int k =0; k<lim;k++)
			System.out.println(a[k]);
		return 1;
	}
}
