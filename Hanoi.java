package 递归;

import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        hanoi(n,'1','2','3');
    }

    public static void hanoi(int n,char a,char b,char c){
        if(n == 1){//边界条件，将编号为1的圆盘从a移到c
            System.out.println("Move" + n + "from" + a + "to" + c);
        }else{//递推公式 从a到c经过b
            hanoi(n - 1,a,c,b);//将a上编号为1到n-1的圆盘移到b上，c作为辅助塔
            System.out.println("Move" + n + "from" + a + "to" + c);
            hanoi(n - 1,b,a,c);//将b上编号为1到n-1的圆盘移到c上，a作为辅助塔
        }
    }
}
