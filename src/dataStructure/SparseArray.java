package dataStructure;

/**
 * @className:SparseArray
 * @description: 稀疏数组
 * @author: renhai
 * @create: 2021-09-16 17:39
 */
public class SparseArray {
    public static void main(String[] args) {
        //创建一个原始的二维数组11*11
        //0：表示没有棋子 1 ：黑子 2： 蓝子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[10][10] = 2;
        for (int[] row : chessArr1) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        int sum = 0;
        for (int j = 0; j < 11; j++) {
            for (int i = 0; i < 11; i++) {
                if (chessArr1[j][i] != 0) {
                    sum++;
                }
            }
        }
        //创建对应的稀疏数组
        int sparseArr[][] = new int[sum + 1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        int count = 0;
        for (int j = 0; j < 11; j++) {
            for (int i = 0; i < 11; i++) {
                if (chessArr1[j][i] != 0) {
                    count++;
                    sparseArr[count][0] = j;
                    sparseArr[count][1] = i;
                    sparseArr[count][2] = chessArr1[j][i];
                }
            }
        }
        System.out.println("稀碎数组为：");
        for (int[] row : sparseArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        //将稀疏数组返回成原数组
        //System.out.println(sparseArr.length);
        int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 1; i < sparseArr.length; i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        System.out.println("还原后的数组为：");
        for (int[] row : chessArr2) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }
}
