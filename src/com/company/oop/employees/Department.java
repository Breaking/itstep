package com.company.oop.employees;

/**
 * Created by Mike on 09.04.2016.
 */
public class Department {
    private String title;

    private AbstractEmployee boss;

    public Department(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public AbstractEmployee getBoss() {
        return boss;
    }

    private void setBoss(AbstractEmployee boss) {
        this.boss = boss;
    }


}
