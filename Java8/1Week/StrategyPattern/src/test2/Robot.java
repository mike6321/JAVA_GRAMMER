package test2;

public abstract class Robot {
	private String name;
	//�������̽� �߰�
	private AttackStrategy attackStrategy;
	private MovingStrategy movingStrategy;
	//�������̽� �߰�
	
    public Robot(String name) { this.name = name; }
    public String getName() { return name; }
  
    // �߻� �޼���
//    public abstract void attack();
//    public abstract void move();
    public void attact() {
    	attackStrategy.attack();
    }
    public void move() {
    	movingStrategy.move();
    }
    
	 // ���� ����, ��ü ��ü�� �޸𸮿��� ������� �ص� �κ� ��ü�� ������� �ʴ´�.
	 // setter �޼���
	 public void setAttackStrategy(AttackStrategy attackStrategy) {
	   this.attackStrategy = attackStrategy; }
	 public void setMovingStrategy(MovingStrategy movingStrategy) {
	   this.movingStrategy = movingStrategy; }
}
