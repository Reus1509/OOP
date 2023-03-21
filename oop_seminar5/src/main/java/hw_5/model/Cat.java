package hw_5.model;

import lombok.AllArgsConstructor;
import lombok.Data;



public class Cat extends Animal{
    private String status;
    private Boolean deletedCrowns;
    public Cat(String name, Integer age, Float weigth, Float height, String status, Boolean deletedCrowns) {
        super(name, age, weigth, height);
        this.status = status;
        this.deletedCrowns = deletedCrowns;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "status='" + status + '\'' +
                ", deletedCrowns=" + deletedCrowns +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getDeletedCrowns() {
        return deletedCrowns;
    }

    public void setDeletedCrowns(Boolean deletedCrowns) {
        this.deletedCrowns = deletedCrowns;
    }
}
