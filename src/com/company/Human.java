package com.company;

public class Human {
    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj ==null) return false;
        if (!(obj instanceof Human)) return false;
        Human n = (Human)obj;
        return n.name == name;
    }

    @Override
    public String toString() {
        return "Name: "+name+", "+age+" years old.";
    }
}
