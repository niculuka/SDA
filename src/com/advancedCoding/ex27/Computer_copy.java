package com.advancedCoding.ex27;


import java.util.Objects;

public class Computer_copy {
    private String processor;
    private String ram;
    private String graphicsCard;
    private String company;
    private String model;

    public Computer_copy(String processor, String ram, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public Computer_copy setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public String getRam() {
        return ram;
    }

    public Computer_copy setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public Computer_copy setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Computer_copy setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Computer_copy setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer_copy that = (Computer_copy) o;
        return Objects.equals(processor, that.processor)
                && Objects.equals(ram, that.ram)
                && Objects.equals(graphicsCard, that.graphicsCard)
                && Objects.equals(company, that.company)
                && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicsCard, company, model);
    }

    @Override
    public String toString() {
        return "ComputerA{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
