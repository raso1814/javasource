package inheritance;

public class TV2 {
	//Main�� ���� Ŭ������ ������ �ȵ�
	
	// �Ӽ�(�ʵ�, �������, ������Ƽ) -> ����, ��������, ä��
	private String color; 
	private boolean power;	//on, off
	private int channel;
	
//	public TV2() {
//		super();
//	}
	
		
	public TV2(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	// ����(�޼ҵ�) => ä�� �����ϴ�(����,����), ������ �Ѵ�
	void channelUp() {
		//channelUp�� �ؾ��ϴ� �۾� �ۼ�
		channel++;
	}
	void channelDown() {
		//channelDown�� �ؾ��ϴ� �۾� �ۼ�
		channel--;
	}
	void power() {
		//power�� �ؾ��ϴ� �۾� �ۼ�
		power = !power;
	}

	public String getColor() {
		return color;
	}

	public boolean isPower() {
		return power;
	}

	public int getChannel() {
		return channel;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	



}
