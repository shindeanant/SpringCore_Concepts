package com.example.springconcepts.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String deptName;

    public String getDeptName(){
        return deptName;
    }

    public void setDeptName(String string){
        this.deptName = deptName;
    }
   
}
