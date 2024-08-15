package QuanLyDuLich5_6;

public class Customer {
    private String name;
    private String sex;
    private TourDuLich[] tour;
    public static int countcustomer=0;

    public Customer(String name, String sex) {
        this.name=name;
        this.sex=sex;
        this.tour=null;
        countcustomer++;
    }

    public int statisticCustomer() {
        return countcustomer;
    }

    public void addTour(TourDuLich t) {
        this.tour[tour.length]=t;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex=sex;
    }

    public void setName(String name) {
        this.name=name;
    }
}
