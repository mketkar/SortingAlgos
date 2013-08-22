//Pick elements one by one and insert in proper order in new list
//this is in place version of the algorithm
//purpose is to just demonstrate basic implementation for worst case scenario n(n-1) 
//O(n2)
public class Insertion {
	public static void main(String [] args){
		int k[] = {5,4,3,2,1};
		for (int i=0;i<k.length -1;i++){
			for(int j=i+1;j>0;j--){
				System.out.println("here" + i + " j: " + j);
				if(k[j] < k[j-1]){
					int temp = k[j];
					k[j] = k[j-1];
					k[j-1] = temp;
				}
			}
		}		
		for(int i=0;i< 5;i++){
			System.out.println(k[i]);
		}
	}	
}
