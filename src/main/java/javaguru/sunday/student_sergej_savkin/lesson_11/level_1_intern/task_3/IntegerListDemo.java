package javaguru.sunday.student_sergej_savkin.lesson_11.level_1_intern.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    List<Integer> integersInArrayList = new ArrayList<>();

    public void addElementToEndOfList(int element){
        integersInArrayList.add(element);
    }

    public void addElementToBeginningOfList(int element){
        integersInArrayList.add(0, element);
    }

    public int getListLength(){
        return integersInArrayList.size();
    }

    public void deleteElementByNumber(int elementNumber){
        integersInArrayList.remove(elementNumber);
    }

    public void deleteElementByObject(Object objectToDelete){
        integersInArrayList.remove(objectToDelete);
    }

    public boolean isEmptyList(){
        return integersInArrayList.isEmpty();
    }

    public void printListToConsole(){
        for (int i = 0; i < integersInArrayList.size(); i++) {
            System.out.println(integersInArrayList.get(i));
        }
    }

}
