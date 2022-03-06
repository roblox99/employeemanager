package com.kaya.employeemanager.model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    @Getter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String jobTitle;

    @Getter
    @Setter
    private String phone;

    @Getter
    @Setter
    private String imageURL;

    @Column(nullable = false, updatable = false)
    @Getter
    @Setter
    private String employeeCode;

    public Employee() {}

    public Employee(String name, String email, String jobTitle, String phone, String imageURL, String employeeCode) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageURL = imageURL;
        this.employeeCode = employeeCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (!id.equals(employee.id)) return false;
        if (!name.equals(employee.name)) return false;
        if (!email.equals(employee.email)) return false;
        if (!jobTitle.equals(employee.jobTitle)) return false;
        if (!phone.equals(employee.phone)) return false;
        if (!imageURL.equals(employee.imageURL)) return false;
        return employeeCode.equals(employee.employeeCode);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + jobTitle.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + imageURL.hashCode();
        result = 31 * result + employeeCode.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return String.format(
                "Employee{id=%d, name=%s, email=%s, jobTitle=%s, phone=%s, imageURL=%s, employeeCode=%s}",
                id,
                name,
                email,
                jobTitle,
                phone,
                imageURL,
                employeeCode
        );
    }

}
