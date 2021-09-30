package array;

public class ArrayTest6 {

	public static void main(String[] args) {
		// 이차원배열
		
		//초기화
		int scores[][]=new int[2][3]; //2행 3열
		scores[0][0] =15;
		scores[0][1] =25;
		scores[0][2] =35;

		scores[1][0] =45;
		scores[1][1] =55;
		scores[1][2] =65;
		
		//확인
		System.out.println("배열 길이(행) : "+scores.length ); //행의갯수
		System.out.println("배열 길이(열) : "+scores[0].length);//0행의 열
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+" ");
			}
			
			System.out.println();
		}
		
		for(int i[]:scores) {
			for(int j:i) {System.out.print(j+" ");}
			System.out.println();
		}
		
		
		int arr[][] = {
				{15,25},
				{65,85,95}
		};

	
		for(int i[]:arr) {
			for(int j:i) {System.out.print(j+" ");}
			System.out.println();
		}

		System.out.println(scores); //[[I@7de26db8
		System.out.println(arr); //[[I@1175e2db
		//배열은 heap에 생성
	
	}

}
