package test1;
public class RobotB extends Robot{
	private String name;
	
	public  String getName() {
		return name;
	}
	
	public RobotB(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("���� �౸�� ����.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� �ִ�.");
	}
	

}
