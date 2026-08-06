package searchalgorithm;

public class linearsearch {
	public static void main(String[] args) {
		int[] nums= {21,34,56,78,32,45};
	    int target=32;
	    
		int ans=linear(nums,target);
		System.out.println(ans);
	
	}
	static int linear(int[] nums,int target) {
		if(nums.length==0) {                   //there is no values in array
			return -1;
		}
		for(int i=0; i<nums.length; i++) {
			if (nums[i]==target) {
			int	result=i;
				return i;
			}
		}
		
		//the searching element not fount in array it returns -1
         return -1;
	}

}
