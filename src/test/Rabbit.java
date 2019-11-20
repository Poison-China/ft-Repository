package test;
/**
 * 兔子
 * @author ml
 *
 */
public class Rabbit {
	public static void main(String[] args) {
		int num = getnum(5);
		System.out.println(num);
	}

	static int num =0;
	public static int  getnum(int mouth ) {
		if(mouth==1) {
			num =1;
		}
		if (mouth==2) {
			num=1;
		}
		return (num-1)+mouth;
	}

}
