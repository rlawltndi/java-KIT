package ex05_overriding;

public class Samsung extends Computer{
	
	//오버라이드        오버로드
	//제정의           중복정의
	
	@Override
	void powerOn() {
		//같은메서드이지만 자식클래스의 성황에 맞기 재정의 하는것
		System.out.println("아이 러브 샘송");
	
	}
	


}
