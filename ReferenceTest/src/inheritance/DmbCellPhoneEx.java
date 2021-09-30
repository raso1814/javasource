package inheritance;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		
		DmbCellPhone phone = new DmbCellPhone();
		
		phone.color="black";
		phone.model="ÀÚ¹ÙÆù";
		phone.channel=7;
		
		phone.powerOn();
		phone.turnOnDmb();
		phone.changeChannelDmb(7);
		phone.turnOffDmb();
		phone.bell();
		phone.sendVoice(null);
		phone.receiveVoice(null);
		
		

	}

}
