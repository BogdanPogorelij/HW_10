package com.company;

public class Human {
    public String name;

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
}
