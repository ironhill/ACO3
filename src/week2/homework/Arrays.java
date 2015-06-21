package week2.homework;

/**
 * Created by Ihor Samanchuk on 21.06.2015.
 */
public class Arrays {
    public class ArrayClass {

        private int diapasoneStart;
        private int getDiapasoneEnd;
        private int arrayLenght;

        public int getDiapasoneStart() {
            return diapasoneStart;
        }

        public void setDiapasoneStart(int diapasoneStart) {
            this.diapasoneStart = diapasoneStart;
        }

        public int getGetDiapasoneEnd() {
            return getDiapasoneEnd;
        }

        public void setGetDiapasoneEnd(int getDiapasoneEnd) {
            this.getDiapasoneEnd = getDiapasoneEnd;
        }

        public ArrayClass(int arrayLenght, int diapasoneStart, int getDiapasoneEnd) {
            this.arrayLenght = arrayLenght;
            this.diapasoneStart = diapasoneStart;
            this.getDiapasoneEnd = getDiapasoneEnd;
        }

        public void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

        public int[] randomArray(int arrayLenght) {
            int[] arrayRandom = new int[arrayLenght];
            for (int i = 0; i < arrayRandom.length; i++) {
                arrayRandom[i] = (int) (Math.random() * 10);
            }
            return arrayRandom;
        }

        public int[] ranDomArrayWithLimits(int arrayLenght, int startRandomValue, int endRandomValue) {
            int[] randomArray = new int[arrayLenght];
            for (int i = 0; i < randomArray.length; i++) {
                randomArray[i] = (int) (startRandomValue + ((Math.random() * (endRandomValue - startRandomValue))));
            }
            return randomArray;
        }

    }
}
