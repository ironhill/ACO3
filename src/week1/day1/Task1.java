package week1.day1;

/**
 * Created by Ihor Samanchuk on 08.06.2015.
 */
public class Task1 {
    public static int[][] rotatateMatrix(int incomeMatrix[][]) {
        int[][] tempMatrix = new int[3][3];
        for (int i = 0; i < incomeMatrix.length; i++) {
            for (int j = 0; j < incomeMatrix[i].length; j++) {
                tempMatrix[j][incomeMatrix.length - 1 - i] = incomeMatrix[i][j];

            }
        }
        return tempMatrix;
    }

    public static void main(String[] args) {
        int[][] massToTurn = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] newArray = rotatateMatrix(massToTurn);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println();
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
        }
    }
}

