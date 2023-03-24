import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

/**
 * 한국기술교육대학교 2023학년도 1학기 알고리즘및실습 과제2
 * @author 2019136056 박세현 
 * @version 2023학년도 1학기
 * Judge1093-B
 * CanSum
 */

public class Main {
	public static boolean canSum(int M, int[] N) {
		if(M<0) return false;
		if(M==0) return true;
		for(var x: N)
			if(canSum(M-x, N)) return true;
		return false;
	}
	public static void main(String[] args) {
		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		){
			int T = Integer.parseInt(br.readLine());
			for(int t=0; t<T; ++t){
				StringTokenizer st = new StringTokenizer(br.readLine());
				int M = Integer.parseInt(st.nextToken());
				int[] nums = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt).toArray();
				System.out.println(canSum(M, nums));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
