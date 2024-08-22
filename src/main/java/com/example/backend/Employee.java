package com.example.backend;
import jakarta.persistence.*;

@Entity
@Table(name = "Employee Skill Info")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Employee_name")
    private String Employee_name;

    @Column(name = "Skill")
    private String Skill;

    @Column(name = "Skill_level")
    private String Skill_level;

    @Column(name = "Date_of_update")
    private String Date_of_update;

    public Employee(){

    }

    public Employee(String Employee_name, String Skill, String Skill_level, String Date_of_update) {
        super();
        this.Employee_name = Employee_name;
        this.Skill= Skill;
        this.Skill_level = Skill_level;
        this.Date_of_update = Date_of_update;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getEmployee_name() {
        return Employee_name;
    }
    public void setEmployee_name(String Employee_name) {
        this.Employee_name = Employee_name;
    }
    public String getSkill() {
        return Skill;
    }
    public void setSkill(String Skill) {
        this.Skill = Skill;
    }
    public String getSkill_level() {
        return Skill_level;
    }
    public void setSkill_level(String Skill_level) {
        this.Skill_level = Skill_level;
    }

    public String getDate_of_update() {
        return Date_of_update;
    }

    public void setDate_of_update(String Date_of_update) {
        this.Date_of_update = Date_of_update;
    }
}


