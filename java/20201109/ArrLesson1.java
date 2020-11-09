public class ArrLesson1{
	public static void main(String[] args){
		//[]←配列　nums←変数名　int[3]←要素数
		int[] nums=new int[3];
		System.out.println(nums.length);
		//length←要素の数
		
		//[]←要素番号を書くとそれを表示
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);

		nums[0]=10;
		nums[1]=20;
		nums[2]=30;

		System.out.println(nums[0]);

		nums[0]=nums[1]+nums[2];
		System.out.println(nums[0]);
	}
}
