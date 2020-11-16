public class KanoSan{
	public static void main(String[] args){
		int[] nums=new int[21];
		for(int i=0;i<nums.length;i++){
			nums[i]=i;
		}
		for(int i=0;i<nums.length;i++){
			if(nums[i]%2==0 && nums[i]%3==0){
				System.out.println("FizzBazz");
			}else if(nums[i]%2==0){
				System.out.println("Fizz");
			}else if(nums[i]%3==0){
				System.out.println("Bazz");
			}else{
				System.out.println(nums[i]);
			}
		}
	}
}
