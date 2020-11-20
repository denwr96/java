package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson7.level6.task13;

class Copy {

    public int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] rangeArray = rangeArray(in, numberFrom, numberTo);
        copyNumbersInRange(in, rangeArray, numberFrom, numberTo);
        return rangeArray;
    }

    public int amountOfNumbersInRange(int[] in, int numberFrom, int numberTo) {
        int amountOfNumbersInRange = 0;
        for (int number : in) {
            if (number >= numberFrom && number <= numberTo) {
                amountOfNumbersInRange = amountOfNumbersInRange + 1;
            }
        }
        return amountOfNumbersInRange;
    }

    public int[] rangeArray (int[] in, int numberFrom, int numberTo) {
        int amountOfNumbersInRange = amountOfNumbersInRange(in, numberFrom, numberTo);
        return new int[amountOfNumbersInRange];
    }

    public void copyNumbersInRange(int[] in, int[] rangeArray, int numberFrom, int numberTo) {
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                for (int j = 0; j < rangeArray.length; j++) {
                    rangeArray[j] = in[i];
                    i++;
                }
            }
        }
    }

}
