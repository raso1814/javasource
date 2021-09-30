package classTest;

public class SubscriberInfo {

	
		// 속성 - 이름, 아이디, 패스워드, 전화번호, 주소
		// 생성자 - 이름, 아이디, 패스워드만 초기화를 한 후 객체 생성
		//        이름, 아이디, 패스워드, 전화번호, 주소
		// 기능 - 비밀번호 변경, 전화번호 변경, 주소 변경


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
