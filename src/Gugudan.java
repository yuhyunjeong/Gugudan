import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
//		// 2단		
//		System.out.println("2단");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
//		System.out.println();
//		
//		//3단
//		System.out.println("3단");
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);
//		System.out.println();
//		
//		//4단
//		
//		System.out.println("4단");
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
		
//		System.out.print("구구단 중 출력할 단은? :");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(num + "단");
//		System.out.println(num * 1);
//		System.out.println(num * 2);
//		System.out.println(num * 3);
//		System.out.println(num * 4);
//		System.out.println(num * 5);
//		System.out.println(num * 6);
//		System.out.println(num * 7);
//		System.out.println(num * 8);
//		System.out.println(num * 9);
//		
		
//		//6단
//		System.out.println("6단");
//		int i = 1;
//		while(i < 10) {
//			System.out.println(6 * i);
//			i = i + 1; // i++
//		}
//		System.out.println();
//		
//		//7단
//		System.out.println("7단");
//		for(int j = 1; j < 10; j++) {
//			System.out.println(7 * j);
//		}
		
		System.out.print("구구단 중 출력할 단은? : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > 1 && num < 10) {
			System.out.println(num + "단");
			for(int i = 1; i < 10; i++) {
				System.out.println(num * i);
			}
		}
		else {
			System.out.println("2 이상, 9 이하의 값만 입력할 수 있습니다.");
		}
		System.out.println();
		
		//배열
		int[] result = new int[9];
		for(int j = 2; j < 10; j++) {
			System.out.println(j + "단");
			for(int i = 0; i < result.length; i++) {
			result[i] = j * (i + 1);
			
			System.out.print(result[i]+" ");
			}
			System.out.println();
			System.out.println();
		}
//		result = new int[9];
//		for(int i=0; i < result.length; i++) {
//			result[i] = 3 * (i + 1);
//			System.out.println(result[i]);
//		}
//		result = new int[9];
//		for(int i=0; i < result.length; i++) {
//			result[i] = 4 * (i + 1);
//			System.out.println(result[i]);
//		}
//		result = new int[9];
//		for(int i=0; i < result.length; i++) {
//			result[i] = 5 * (i + 1);
//			System.out.println(result[i]);
//		}
//		result = new int[9];
//		for(int i=0; i < result.length; i++) {
//			result[i] = 6 * (i + 1);
//			System.out.println(result[i]);
//		}
//		result = new int[9];
//		for(int i=0; i < result.length; i++) {
//			result[i] = 7 * (i + 1);
//			System.out.println(result[i]);
//		}
//		result = new int[9];
//		for(int i=0; i < result.length; i++) {
//			result[i] = 8 * (i + 1);
//			System.out.println(result[i]);
//		}
//		result = new int[9];
//		for(int i=0; i < result.length; i++) {
//			result[i] = 9 * (i + 1);
//			System.out.println(result[i]);
//		}
		
		
	}

}
