package ooplab9;

public class Person {
    private String name;
    private String presonid;
    private Address Address;
    private Job job;

    public Person(String name, String presonid, ooplab9.Address address, Job job) {
        this.name = name;
        this.presonid = presonid;
        this.Address = address;
        this.job = job;
    }
    //getter and setter method

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", presonid='" + presonid + '\'' +
                ", Address='" + Address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresonid() {
        return presonid;
    }

    public void setPresonid(String presonid) {
        this.presonid = presonid;
    }

    public ooplab9.Address getAddress() {
        return Address;
    }

    public void setAddress(ooplab9.Address address) {
        Address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
