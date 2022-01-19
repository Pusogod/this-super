package super변수예제;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();

		//객체에게 동작 => 메소드 호출
		sa.takeoff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		/*
		 * 이륙합니다.
			일반 비행합니다.
			초음속 비행입니다.
			일반 비행합니다.
			착륙합니다.
		 */

	}

}
