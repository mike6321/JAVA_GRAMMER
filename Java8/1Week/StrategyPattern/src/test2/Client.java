package test2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robotA = new RobotA("���ؿ�");
		Robot robotB = new RobotB("���ؿ�2");
		
		robotA.setAttackStrategy(new MissileStrategy());
		robotB.setMovingStrategy(new FlyingStrategy());
		
		
	}

}
