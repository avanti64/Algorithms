package test.internship;

public class ReadSched {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadSched rs = new ReadSched();
		int[] sec = {0,10,5,7,5,6,17,30,25,30,10};
		rs.determinSched(7, sec, 30);

	}

	public void determinSched(int days, int[] sec, int min){
		int num_sec = sec.length;
		int [][] M = new int[days + 1][num_sec + 1];
		int T = 0;
		for(int j=0; j<=10; j++){
			T = T + sec[j];
			if(j == 0){
				M[1][j] = (int)Math.pow(Math.max(min-0, 0), 4) + Math.max(0-min, 0);
			}
			else{
				M[1][j] = (int)Math.pow(Math.max(min - T, 0), 4) + Math.max(T - min, 0);
			}
		}
		System.out.print("\nMax Table at i = 1 is : ");
		for(int s : M[1])
			System.out.print(s + " ");
		for(int i=2; i<=7; i++){
			for(int j=1; j<=10; j++){
				int curr_min = M[i-1][j] + (int)Math.pow(Math.max(min - T, 0), 4) + Math.max(T - min, 0);
				M[i][0] = M[i-1][0] + (int)Math.pow(Math.max(min - T, 0), 4) + Math.max(T - min, 0);
				for(int k=1; k <= j; k++){
					M[i][j] = Math.min(curr_min, M[i-1][j-k] + (int)Math.pow(Math.max(min - getTx(sec, j-k+1, j), 0), 4) + Math.max(getTx(sec, j-k+1, j) - min,0));
					curr_min = M[i][j];
				}
			}
			System.out.print("\nMax Table at i = "+i+ "  is : ");
			for(int s : M[i])
				System.out.print(s + " ");
		}
	}
	
	int getTx(int sec[], int start, int end){
		int T = 0;
		for(int i=start;i<=end;i++){
			T = T + sec[i];
		}
		
		return T;
	}
}