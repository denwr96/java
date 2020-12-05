package main.java.javaguru.sunday.student_artjom_proshkin.lesson_7.level_6_middle.task_13;

class Copy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] outRange = createOutRange(in, numberFrom, numberTo);
        fillOutRange(in, numberFrom, numberTo, outRange);
        return outRange;
    }

    int calculateOutRangeLength(int[] in, int numberFrom, int numberTo) {
        int outRangeLength = 0;
        for (int number : in) {
            if (number >= numberFrom && number <= numberTo) {
                outRangeLength++;
            }
        }
        return outRangeLength;
    }

    int[] createOutRange(int[] in, int numberFrom, int numberTo) {
        int outRangeLength = calculateOutRangeLength(in, numberFrom, numberTo);
        return new int[outRangeLength];
    }

    void fillOutRange(int[] in, int numberFrom, int numberTo, int[] outRange) {
        int fillCounter = 0;
        for (int number : in) {
            if (number >= numberFrom && number <= numberTo) {
                outRange[fillCounter] = number;
                fillCounter++;
            }
        }
    }
}
