package main.java.javaguru.sunday.student_artjom_proshkin.lesson_10.level_1_intern.task_3;

interface MyList {

    void add (Object t);

    void add (int index,Object t);

    void remove (Object toRemove);

    void remove (int index);

    void get (Object t);

    void set (int index, Object t);

    void replace (Object toReplace, Object newObject);

    void replaceAll ();

    void findDuplicate (Object toFind);
}
