package Abstract.Demo3;

abstract class Person {
    private String name;
    private String address;
    public Person (String name, String address){
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address=address;
    }
    abstract void display();
}
