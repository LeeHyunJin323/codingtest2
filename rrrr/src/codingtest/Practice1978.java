package codingtest;

// isPrime 함수 만들기 
// Math.sqrt = 제곱근 
// 제곱근 n 값
import java.util.Scanner;

public class Practice1978 {

	public static void main(String[] args) {
		// 첫 줄에 수의 개수 N이 주어진다 
		// N은 100 이하 
		// N개의 수가 주어지는데 수는 1000 이하의 자연수
		
		// 4를 받으면 숫자 4개를 받을 수 있음
		
		// 주어진 수 중 소수면 count ++ 해서 값 먹이면 될듯

		Scanner sc = new Scanner(System.in);
		int num = 0;
		
	   int count = 0;
	   int N = sc.nextInt();
	   for (int i = 0; i<N; i++)
	   {
		   num = sc.nextInt();
		   if(IsPrime(num))
		   {
			   count++;
		   }
		   
	   }
	   System.out.println(count);
		
	}

	public static boolean IsPrime(int n) {
		
		if (n < 2) {
			return false;
		}
		
		for(int i = 2; i<= Math.sqrt(n); i++)
		{
			if(n%i == 0)
			{
				return false;
			}
			
		}
		return true;
	}
}


	 

