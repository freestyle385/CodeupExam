import java.util.Scanner;

public class exam1019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] commandBits = sc.nextLine().split("\\."); 
//		split으로 연, 월, 일을 .로 나눔
		sc.close();
		
		int year = Integer.parseInt(commandBits[0]);
		int month = Integer.parseInt(commandBits[1]);
		int day = Integer.parseInt(commandBits[2]);
//		Integer.parseInt : 입력받은 문자열을 숫자로 변환
//		commandBits[0]에서의 0은 입력받은 문자열 중 해당 단어의 순번(ex: 2013.8.5 에서 2013이 해당)
		
		System.out.printf(String.format("%04d.%02d.%02d", year, month, day));
//		"%04d.%02d.%02d" 는 각 yyyy.mm.dd로 자릿수를 맞추기 위함. (ex: %04d는 4자리로 설정되며 빈칸은 0으로 채워짐)
	}

}