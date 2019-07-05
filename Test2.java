/*
给定一个有n个正整数的数组A和一个整数sum,求选择数组A中部分数字和为sum的方案数。
当两种选取方案有一个数字的下标不一样,我们就认为是不同的组成方案。

输入描述:
输入为两行:
第一行为两个正整数n(1 ≤ n ≤ 1000)，sum(1 ≤ sum ≤ 1000)
第二行为n个正整数A[i](32位整数)，以空格隔开。

输出描述:
输出所求的方案数
示例1
输入
5 15 5 5 10 2 3
输出
4
*/

package written_test0705;

import java.util.Scanner;
//数字和为sum的方法数
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        long[] dp = new long[sum+1];
        dp[0] = 1;
        for(int i=0;i<n;i++){
            for(int j=sum;j>=arr[i];j--){
                dp[j] += dp[j-arr[i]];
            }
        }
        System.out.println(dp[sum]);
    }
}
