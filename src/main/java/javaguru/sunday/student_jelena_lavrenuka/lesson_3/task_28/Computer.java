package javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_28;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Computer {

    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    String getManufacturer() {

        return this.manufacturer;
    }

    String getModel() {
        return this.model;
    }

}
