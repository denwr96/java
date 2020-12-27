package javaguru.sunday.teacher.lesson_7.lessoncode.domen;


import java.util.ArrayList;
import java.util.List;

public class Policy {

    List<InsuredObject> insuredObjects = new ArrayList<>();

    public List<InsuredObject> getInsuredObjects() {
        return insuredObjects;
    }

    public void addInsObject(InsuredObject insuredObject) {
        insuredObjects.add(insuredObject);
    }
}
