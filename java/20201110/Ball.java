public class Ball{
	public static void main(String[] args){
		int[] box={1,2,3,4,5};
		int[] history={0,0,0,0,0};
		int index=0;
		for(int i=0;i<box.length;i++){
		index=new java.util.Random().nextInt(box.length);
		history[index]=box[index];
		while(history[0]==box[0] && history[1]==box[1] && history[2]==box[2] && history[3]==box[3] && history[4]==box[4] ){
		index=new java.util.Random().nextInt(box.length);
		history[index]=box[index];
		}

		System.out.println(box[index]);
		}
	}
}
