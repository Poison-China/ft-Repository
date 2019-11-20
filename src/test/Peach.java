package test;
/**
 * 猴子
 * @author ml
 *
 */
public class Peach {
	public static void main(String[] args) {
		int peachNum=1;
		for (int i = 1; i <10; i++) {
			peachNum = (peachNum+1)*2;
		}
		System.out.println(peachNum);
	}
//第一天的桃子数量  peachNum/2 +1
}
