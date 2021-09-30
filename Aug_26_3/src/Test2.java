//comment : 컴파일때 제외
/*
 * 여
 * 러
 * 줄
 * 주
 * 석(범위지정주석)
 * */
/**
 * compile시 빠지는 주석 매뉴얼 만들때 쓰는
 * 
 * @author user
 *
 */
//ctrl+/ : 주석처리 뺏다가 넣었다가
//ctrl+shift+/ : 블록지정 주석처리
//ctrl+space : java 참고
//ctrl+m : 전체화면
//ctrl+F11 : 실행
//ctrl+alt+위/아래 : 줄 복사
//ctrl+d : 줄삭제
//alt+위/아래 : 줄옮기기
//ctrl+shift+f : 가독성 좋게 소스 정리, 줄정리
// ; semi-colon
// : colon
// / slash
// \ back slash
// | pipe bar

public class Test2 {
	// main, ctrl+space
	public static void main(String[] args) throws InterruptedException {
		// syso, ctrl+space
		System.out.println("뭘 봐요 수업하는데 자꾸 밖에서");
		System.out.println("뭘 봐요 수업하는데 자꾸 밖에서");
		System.out.println("뭘 봐요 수업하는데 자꾸 밖에서");
		
		Thread.sleep(5000);
		// console창에 출력할 때 사용
		// ; : 한글에서 온점(.)을 문장구별할때 쓰듯이 JAVA에선 ;
	}
}
