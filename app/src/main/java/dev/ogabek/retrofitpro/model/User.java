package dev.ogabek.retrofitpro.model;

public class User {

    private final int age;
    private final String id, name, status;

    public User(int age, String id, String name, String status) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "  " +
                "Name: " + getName() + "  " +
                "Age: " + getAge() + "  " +
                "Status: " + getStatus() + "\n";
    }
}
