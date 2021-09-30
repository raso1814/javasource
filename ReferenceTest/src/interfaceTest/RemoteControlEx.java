package interfaceTest;

public class RemoteControlEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteControl rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		
		System.out.println();
		
		
		//�͸� ���� ��ü
		RemoteControl rc1 = new RemoteControl() {
			
			private int volume;
			
			@Override
			public void turnOn() {
				System.out.println("������ �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("������ ���ϴ�");
			}
			
			@Override
			public void setVolume(int volume) {
				if(volume>RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else if(volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else {
					this.volume = volume;
				}
				
		System.out.println("���� ���� : "+this.volume);				
			}
		};
		
		
		rc1.turnOn();
		rc1.setVolume(5);
		rc1.turnOff();
		
	
		
		
	}

}
