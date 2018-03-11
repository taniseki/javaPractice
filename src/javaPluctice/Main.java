package javaPluctice;

public class Main {

	public static void main(String[] args) {

		Human tanaka = new Human("田中",22,10000);

		Human maeda = new Human("前田", 24,15);

		tanaka.IntroduceYourself();
		maeda.IntroduceYourself();
		maeda.Attack(tanaka);

		if(tanaka.getHp()<=0){
			System.out.println(tanaka.getName() + "は倒された");
			System.out.println("今日、そろそろ寝ます");
			System.out.println("コンフリクトしたら修正して終わり");
		}
	}

}
