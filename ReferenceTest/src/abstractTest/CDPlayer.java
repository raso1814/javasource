package abstractTest;

public class CDPlayer extends Player {

	@Override
	void play(int pos) {
		
		System.out.println(pos+" �κп��� ���");
		super.play();

	}

	@Override
	void stop() {
		System.out.println("��� ����");

	}

}
