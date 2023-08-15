package basic;

public class random {
	public static void main(String args[]) {
		int n = 3;
        
        int res = 0;
        for(int i=1;i<=n;i++){
        	int sum = 0;
            for(int j=1;j<=i;j++){ 
                sum+=j;
            }
            res += sum;
        }
        System.out.println(res);	
	}
}
