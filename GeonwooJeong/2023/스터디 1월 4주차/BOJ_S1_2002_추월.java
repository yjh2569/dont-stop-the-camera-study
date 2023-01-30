import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ_S1_2002_추월 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		Map<String, Integer> map = new HashMap<>();

		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			String car = br.readLine();
			map.put(car, i);
		}
		
		int [] out = new int[N];
		
		for (int i = 0; i < N; i++) {
			String car = br.readLine();
			out[i] = map.get(car);
		}
		
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < out.length; j++) {
				if(out[i]>out[j]) {
					cnt++;
					break;
				}
			}
		}
		
		System.out.println(cnt);
		
	}

}
