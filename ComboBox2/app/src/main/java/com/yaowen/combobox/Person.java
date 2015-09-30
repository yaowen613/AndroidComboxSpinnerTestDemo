package com.yaowen.combobox;

/**
 * Created by HelloWorld on 2015/9/30.
 */
public class Person {
    private String personName, personAdd, personAge, personPhone, personWorlk;

    public Person(String personName, String personAdd, String personAge, String personPhone, String personWorlk) {
        super();
        this.personName = personName;
        this.personAdd = personAdd;
        this.personAge = personAge;
        this.personPhone = personPhone;
        this.personWorlk = personWorlk;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAdd() {
        return personAdd;
    }

    public void setPersonAdd(String personAdd) {
        this.personAdd = personAdd;
    }

    public String getPersonAge() {
        return personAge;
    }

    public void setPersonAge(String personAge) {
        this.personAge = personAge;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }

    public String getPersonWorlk() {
        return personWorlk;
    }

    public void setPersonWorlk(String personWorlk) {
        this.personWorlk = personWorlk;
    }
}
