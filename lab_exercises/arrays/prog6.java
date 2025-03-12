// package lab_exercises.arrays;

// Emily runs a bakery and tracks the monthly profits and losses of her business over a period of time. She wants to calculate her maximum net profit by removing one continuous subarray (one or more consecutive months) with the highest loss (i.e., the subarray with the smallest sum).
// However:
// If all months have only one loss, no subarray is removed.
// Otherwise, she removes the continuous subarray with the most significant loss, and the rest of the months contribute to the net profit.
// Your task is to help Emily determine the maximum possible net profit she can achieve after following these rules.

// Example

// Input:

// 6
// 1000 -200 300 -500 400 300

// Output:
// 1800

// Explanation:
// The month where the business performed poorly was with a loss of 500. So, after ignoring that month, the net profit is 1000-200+300+400+300 = 1800.




import java.util.Scanner;



class ExpenseAnalyzer {
    public int calculateMaxRemainingBudget(int[] expenses){
        int totalSum = 0;
        for(int value : expenses){
            totalSum+=value;
        }
        int minSubarraySum = expenses[0];
        int currentMin = expenses[0];
        for(int i = 1;i<expenses.length;i++){
            currentMin = Math.min(expenses[i],currentMin+expenses[i]);
            minSubarraySum = Math.min(minSubarraySum,currentMin);
        }
        if(minSubarraySum == totalSum){
            return totalSum;
        }
        return totalSum - minSubarraySum;
    }
}








public class prog6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] expenses = new int[n];
        for (int i = 0; i < n; i++) {
            expenses[i] = scanner.nextInt();
        }

        ExpenseAnalyzer analyzer = new ExpenseAnalyzer();
        int maxRemainingBudget = analyzer.calculateMaxRemainingBudget(expenses);

        System.out.println(maxRemainingBudget);

        scanner.close();
    
    }
}   
