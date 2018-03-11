package javaPluctice;

import java.util.Random;

public class Human {

	private String name;
	private int age;
	private int hp;

	/*
	 * コンストラクタ
	 */
	public Human(String name,int age,int hp) {
		this.name = name;
		this.age = age;
		this.hp = hp;
	}


	public void IntroduceYourself(){
		System.out.println("私の名前は"+ name + "です。年齢は" + age + "です。" );
	}

	//引数のhumanは、攻撃対象
	public void Attack(Human human){
		Random random = new Random();
		int damagePoint = random.nextInt(50000);
		System.out.println(this.name + "の攻撃！" + human.name +"に"+ damagePoint
				+ "ポイントのダメージ");

		int damage = human.getHp() - damagePoint;
		human.setHp(damage);

		System.out.println(human.name + "の残りhp:" + human.hp);
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return hp
	 */
	public int getHp() {
		return hp;
	}


	/**
	 * @param hp セットする hp
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
}
