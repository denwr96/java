package main.java.javaguru.sunday.teacher.lesson_7.lessoncode.domen;


import main.java.javaguru.sunday.teacher.lesson_7.lessoncode.domen.enums.InsuranceRisk;

import java.math.BigDecimal;
import java.util.List;

public abstract class InsuredObject {

    private BigDecimal cadastralValue;
    private List<SubInsuredObject> subInsuredObjects;
    private List<InsuranceRisk> insuranceRisk;

    public InsuredObject(BigDecimal cadastralValue, List<SubInsuredObject> subInsuredObjects, List<InsuranceRisk> insuranceRisk) {
        this.cadastralValue = cadastralValue;
        this.subInsuredObjects = subInsuredObjects;
        this.insuranceRisk = insuranceRisk;
    }

    public abstract BigDecimal getRiskCoefficient(InsuranceRisk insuranceRisk);

    public BigDecimal getCadastralValue() {
        return cadastralValue;
    }

    public void setCadastralValue(BigDecimal cadastralValue) {
        this.cadastralValue = cadastralValue;
    }

    public List<SubInsuredObject> getSubInsuredObjects() {
        return subInsuredObjects;
    }

    public void setSubInsuredObjects(List<SubInsuredObject> subInsuredObjects) {
        this.subInsuredObjects = subInsuredObjects;
    }

    public List<InsuranceRisk> getInsuranceRisk() {
        return insuranceRisk;
    }

    public void setInsuranceRisk(List<InsuranceRisk> insuranceRisk) {
        this.insuranceRisk = insuranceRisk;
    }
}
