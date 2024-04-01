package person.sakitamako.com.github;

public class Test {
	public static void main(String[] agrs) {
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "090-0000-0000";
		taro.address = "taro@gmail.com";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "080-1111-1111";
		jiro.address = "jiro@yahoo.co.jp";
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "070-2222-2222";
		hanako.address = "hanako@softbank.ne.jp";
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();
		
		Person saki = new Person();
		saki.name = "鈴木紗季";
		saki.age = 31;
		saki.phoneNumber = "060-3333-3333";
		saki.address = "saki@i.softbank.jp";
		
		System.out.println(saki.name);
		System.out.println(saki.age);
		System.out.println(saki.phoneNumber);
		System.out.println(saki.address);
		saki.talk();
		saki.walk();
		saki.run();
	}

}
