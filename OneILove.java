public class OneILove{
	String name;
	public OneILove(String name){
	this.name=name;
	}
	public void repConfession(String yourName,int weight,int sabing,boolean effort){
                if(effort==false){
                        System.out.printf("%sさんみたいに努力しない人って最低だと思う%n",yourName);
                }else if(weight>55&&sabing<1000){
                        System.out.printf("%sさんのレベルで私と付き合えると思う？%n",yourName);
                }else if(weight<55&&sabing>1000){
                        System.out.printf("ごめんなさい。%sさんの性格が無理%n",yourName);

                }else if(weight<55){
                        System.out.printf("%sさんて見た目しか取り柄ないよね%n",yourName);
                }else if(sabing>1000){
                        System.out.printf("%sさん、お金だけで私のこと落とせると思った？%n",yourName);
                }
	}	
}
