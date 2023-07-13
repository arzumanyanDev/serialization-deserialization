package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Organization {

    private String name;
    private String creationDate;
    private Status status;
    private List<Employee> employees;


    public Organization(String name, String creationDate, Status status) {
        this.name = name;
        this.creationDate = creationDate;
        this.status = status;
        employees = new ArrayList<>();
    }
}
