package test;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5. 아래 조건에 맞게 인터페이스, 클래스 생성 후 메인 메소드에서 호출
		// 조건 1. 인터페이스 생성. 인터페이스명 : CarManager
		// 조건 2. 인터페이스에 다음 추상 메소드를 추가
		//        -- 메소드명 : SpeedUp, 리턴타입 : void, 매개변수 : int형 변수 1개
		//        -- 메소드명 : SpeedDown, 리턴타입 : void, 매개변수 : int형 변수 1개
		//        -- 메소드명 : getSpeed, 리턴타입 : int, 매개변수 : 없음
		
		// 조건 3. 클래스 생성. 클래스명 : Car
		// 조건 4. 아래 조건에 맞게 클래스 작성
		//        -- 필드(변수) 생성, kind(String), speed(int), color(String)
		//        -- Car c = new Car("소나타", 0, "검정"); 코드가 정상 동작하도록 생성자 작성
		//        -- System.out.println(c); 해당 코드 실행 시 '차 종류는 소나타, 색은 검정 입니다' 출력되도록 toString 메소드 재정의
		//        -- CarManager를 implements하여 아래 조건에 맞게 추상메소드 모두 오버라이딩할 것
		//        	-- SpeedUp -> 기존 speed변수 값에 매개변수로 받은 값만큼 증가
		//                      단, 매개변수로 음수는 입력되지 않는다고 가정하며, 증가된 speed가 200이 초과할 경우 200으로 고정
		//        	-- SpeedDown -> 기존 speed변수 값에 매개변수로 받은 값만큼 감소
		//                      단, 매개변수로 음수는 입력되지 않는다고 가정하며, 감소된 speed가 0이 미만일 경우 0으로 고정
		//          -- getSpeed -> speed값을 리턴
		
		// 조건 5. main메소드에서 아래 코드를 실행하고 결과를 캡처
		// Car c = new Car("소나타", 0, "검정");
		// System.out.println(c); 
		// c.SpeedUp(100);
		// c.getSpeed();
		// c.SpeedUp(150);
		// c.getSpeed();
		// c.getSpeedDown(30);
		// c.getSpeed();
	} 

}
