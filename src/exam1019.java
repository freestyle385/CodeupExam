import java.util.Scanner;

public class exam1019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] commandBits = sc.nextLine().split("\\."); 
//		split���� ��, ��, ���� .�� ����
		sc.close();
		
		int year = Integer.parseInt(commandBits[0]);
		int month = Integer.parseInt(commandBits[1]);
		int day = Integer.parseInt(commandBits[2]);
//		Integer.parseInt : �Է¹��� ���ڿ��� ���ڷ� ��ȯ
//		commandBits[0]������ 0�� �Է¹��� ���ڿ� �� �ش� �ܾ��� ����(ex: 2013.8.5 ���� 2013�� �ش�)
		
		System.out.printf(String.format("%04d.%02d.%02d", year, month, day));
//		"%04d.%02d.%02d" �� �� yyyy.mm.dd�� �ڸ����� ���߱� ����. (ex: %04d�� 4�ڸ��� �����Ǹ� ��ĭ�� 0���� ä����)
	}

}