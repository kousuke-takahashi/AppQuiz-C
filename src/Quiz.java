import java.util.Scanner;

public class Quiz {


	public static void main(String[] args){
		System.out.println(situmon1());
		int situ1 = situmon1();
		int situ2 = situmon2();
		int situ3 = situmon3();
		int situ4 = situmon4();
		int situ5 = situmon5();
		int situ6 = situmon6();


	}



	public static int situmon1(){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		String[] s = {"悩みの解決法" , "恋人について" , "自分の将来" , "考えているわけではない"};
		System.out.println("問1");
		System.out.println("彫刻家ロダンが作った「考える人」は何を考えている？");

		for(int i = 0; i < s.length; i++){
			System.out.println((i+1) + "." + s[i]);
		}

		int n = sc.nextInt();
		System.out.print("解答欄 :" + n);

		if(n == 1 || n == 2 || n == 3){
			ans = 2;
			System.out.println("不正解！ 正解は4の「" + s[3] + "」");
			System.out.println("考える人は実は「地獄に落ちる罪人を上から見ている人」を");
			System.out.println("表している。作品名は「リュディエ」という人物が名付けたという");
		}

		else if(n == 4){
			ans = 1
			System.out.println("正解！ 正解は4の「" + s[3] + "」");
		}

		return ans;

	}

	public static int situmon2(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

	public static int situmon3(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

	public static int situmon4(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

	public static int situmon5(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

	public static int situmon6(){
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		return ans;

	}

}
