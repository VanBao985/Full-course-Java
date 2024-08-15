package Shape_template_wildcard;

public abstract class Shape {
    private String name;
    public Shape(String name){
        this.name = name;
    }
    public abstract double getArea();

    public abstract String getName() ;
}
