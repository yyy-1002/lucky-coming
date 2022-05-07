package 递归;

import java.util.Scanner;

/*
 *1.找重复：自己打印i，剩下的由递归调用
 *2.找变化：i变化
 *3.找边界：i < j,当i > j时，返回
 */
public class 打印i到j {
    static void f2(int i, int j){
        if(i > j){
            return;
        }
        System.out.println(i);
        f2(i + 1, j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        f2(x,y);
    }
}
