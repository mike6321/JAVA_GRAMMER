package test1;
public class RobotA extends Robot{
	private String name;
	
	public RobotA(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		//������ ���� �� �ڵ� ��ü�� �����ϴ� ���� OCP ��Ģ�� ����Ǵ� �����̴�.
		//�������̽��� ũ�� �μ� �ڵ带 �����ϱ� ���ٴ� ���Ӱ� ����� ����� �ξ� ȿ����
		System.out.println("���� �̻����� ������ �ִ�.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("���� �ȱ� �ۿ� ����.");
	}
	
	
}
