package classTest;

public class SubscriberInfo {

	
		// �Ӽ� - �̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּ�
		// ������ - �̸�, ���̵�, �н����常 �ʱ�ȭ�� �� �� ��ü ����
		//        �̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּ�
		// ��� - ��й�ȣ ����, ��ȭ��ȣ ����, �ּ� ����


		private String name;
		private String id;
		private String pw;
		private String tel;
		private String add;
		
		public SubscriberInfo(String name, String id, String pw) {
			super();
			this.name = name;
			this.id = id;
			this.pw = pw;
		}

		public SubscriberInfo(String name, String id, String pw, String tel, String add) {
			super();
			this.name = name;
			this.id = id;
			this.pw = pw;
			this.tel = tel;
			this.add = add;
		}
		
		public void setPw(String pw) {
			this.pw = pw;
		}
		
		public void setTel(String tel) {
			this.tel = tel;
		}
		
		public void setAdd(String add) {
			this.add = add;
		}
		
		


}
