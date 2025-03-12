import java.util.Scanner;
class PrimeAnalyzer{
    private boolean isPrime(int num){
        if(num<=1) return false;
        for(int i =2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public int findPrimeSumAfterDeletion(int[] nums){
        int sum =0;
        for(int num:nums){
            sum+=num;
        }
        for(int num:nums) if(isPrime(sum-num)) return sum-num;
        return -1;
    }
}

class prog1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        PrimeAnalyzer analyzer = new PrimeAnalyzer();
        int result = analyzer.findPrimeSumAfterDeletion(nums);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("No valid prime sum found");
        }
        scanner.close();
    }
}