public class mineleinarray {
public static void main(String[] args) {
	int[] nums={43,32,54,75,12,-45,11};
	
	int result=min(nums);
	System.out.println(result);
}
static int min(int[] nums) {
	if(nums.length==0) {
		return -1;
	}
	
	int min=nums[0];
	for(int i=0; i<nums.length; i++) {
		if(nums[i]<min) {
			min=i;
		}
	}
return min;
}
}
