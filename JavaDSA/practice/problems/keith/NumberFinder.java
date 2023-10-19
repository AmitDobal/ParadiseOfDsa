package practice.problems.keith;

public class NumberFinder {
	  public boolean isKeith(int n){
	      int n1 = n;
	      String s = Integer.toString(n);
	      int d = s.length();
	      int arr[] = new int[n];
	      int i,sum;
	      for(i=d-1;i>=0;i--){
	        arr[i]=n1%10;
	        n1=n1/10;
	      }
	      i=d;
	      sum=0;
	      while(sum<n){
	        sum=0;
	        for(int j=1;j<=d;j++){
	          sum+=arr[i-j];
	        }
	        arr[i]=sum;
	        i++;
	      }
	      if(sum==n)
	      return true;
	      else 
	        return false;
	    }
	  	public boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;  // Numbers less than or equal to 1 are not prime.
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;  // The number is divisible by a number other than 1 and itself.
	            }
	        }

	        return true;  // The number is prime.
	    }
}
