package super��������;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();

		//��ü���� ���� => �޼ҵ� ȣ��
		sa.takeoff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		/*
		 * �̷��մϴ�.
			�Ϲ� �����մϴ�.
			������ �����Դϴ�.
			�Ϲ� �����մϴ�.
			�����մϴ�.
		 */

	}

}
