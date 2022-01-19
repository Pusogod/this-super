package super��������;

public class SupersonicAirplane extends Airplane {
	// ��� ���� => ���� ����ϴ� ���������� ����� ��������ν� �������� �����ش�.
	public static final int NORMAL = 1; // �Ϲ� ����
	public static final int SUPERSONIC = 2; // �ʰ�� ����
	
	// ��� ���� ����
	public int flyMode = NORMAL;
	
	@Override // �޼ҵ� �������̵� => �������� �����ϱ� ���� ����
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����Դϴ�.");
		} else {
			super.fly();		// �θ� Ŭ������ fly() �޼ҵ带 ȣ���ϰڴ�.
		}
	}
}
