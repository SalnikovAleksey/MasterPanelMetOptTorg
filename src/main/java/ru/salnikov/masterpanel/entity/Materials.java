package ru.salnikov.masterpanel.entity;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class Materials {

    private SimpleIntegerProperty number;
    private SimpleStringProperty nomenclature;
    private SimpleIntegerProperty weight;
    private SimpleStringProperty date;

    public Materials(int number, String nomenclature, int weight, String date) {
        this.number = new SimpleIntegerProperty(number);
        this.nomenclature = new SimpleStringProperty(nomenclature);
        this.weight = new SimpleIntegerProperty(weight);
        this.date = new SimpleStringProperty(date);
    }

    public int getNumber() {
        return number.get();
    }

    public SimpleIntegerProperty numberProperty() {
        return number;
    }

    public void setNumber(int number) {
        this.number.set(number);
    }

    public String getNomenclature() {
        return nomenclature.get();
    }

    public SimpleStringProperty nomenclatureProperty() {
        return nomenclature;
    }

    public void setNomenclature(String nomenclature) {
        this.nomenclature.set(nomenclature);
    }

    public int getWeight() {
        return weight.get();
    }

    public SimpleIntegerProperty weightProperty() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight.set(weight);
    }

    public String getDate() {
        return date.get();
    }

    public SimpleStringProperty dateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date.set(date);
    }
}
