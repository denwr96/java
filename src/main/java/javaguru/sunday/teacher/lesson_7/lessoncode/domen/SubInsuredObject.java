package javaguru.sunday.teacher.lesson_7.lessoncode.domen;


import javaguru.sunday.teacher.lesson_7.lessoncode.domen.enums.InsuranceRisk;

import java.math.BigDecimal;
import java.util.List;

public class SubInsuredObject {

    private String name;
    private BigDecimal price;
    private List<InsuranceRisk> insuranceRisks;

    public SubInsuredObject(String name, BigDecimal price, List<InsuranceRisk> insuranceRisks) {
        this.name = name;
        this.price = price;
        this.insuranceRisks = insuranceRisks;
    }

    public void addRisk(InsuranceRisk risk) {
        insuranceRisks.add(risk);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public List<InsuranceRisk> getInsuranceRisks() {
        return insuranceRisks;
    }
}
