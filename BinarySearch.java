package BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		int binarySearch[] = new int[10];
		for (int i=0;i<=args.length-1;i++) {
			binarySearch[i]=Integer.parseInt(args[i]);
		}
		
		int search = search(binarySearch,8);
		if(search==-1) {
			System.out.println("Number not found");
		}
		else {
			System.out.println("Number is present at the location"+(search+1));
		}

	}
	
	public static int search(int binarySearch[],int number) {
		int length = binarySearch.length-1;
		int temp = 0;
		if(length==0) {
			if(binarySearch[length]==number) {
				return length;	
			}
			else {
				return-1;
			}
		}
		for(int i=0;i<length;i++) {
			for(int j=0;j<=length-1;j++) {
				if(binarySearch[j]>binarySearch[j+1]) {
					temp=binarySearch[j+1];
					binarySearch[j+1]=binarySearch[j];
					binarySearch[j]=temp;
				}
			}
		}
		int lowerIndex = 0;
		int higherIndex = length;
		int mid = 0;
		while(lowerIndex<=higherIndex) {
			mid =(lowerIndex+higherIndex)/2;
			if(binarySearch[mid]==number) {
				return mid;
			}
			if(binarySearch[mid]<number) {
				lowerIndex= mid+1;
			}
			if(binarySearch[mid]>number) {
				higherIndex=mid-1;
			}
		}
		return -1;
		
		
	}

}
