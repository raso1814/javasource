package inheritance;

public class TV2 {
	//Main이 없는 클래스는 실행이 안됨
	
	// 속성(필드, 멤버변수, 프로퍼티) -> 색상, 전원상태, 채널
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
	// 동작(메소드) => 채널 변경하다(증가,감소), 전원을 켜다
	void channelUp() {
		//channelUp이 해야하는 작업 작성
		channel++;
	}
	void channelDown() {
		//channelDown이 해야하는 작업 작성
		channel--;
	}
	void power() {
		//power가 해야하는 작업 작성
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
