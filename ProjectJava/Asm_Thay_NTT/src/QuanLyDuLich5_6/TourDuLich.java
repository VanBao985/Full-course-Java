package QuanLyDuLich5_6;

public class TourDuLich {
    private Customer kh;
    private DiaDiem dd;
    private KhachSan ks;
    public static int countcanceltour = 0;
    public static int countbooktour = 0;
    public TourDuLich(Customer kh, DiaDiem dd, KhachSan ks){
        this.kh = kh;
        this.dd = dd;
        this.ks = ks;
        ks.addKh(kh);
        countbooktour++;
    }
    public void cancel(TourDuLich tour){
        tour.kh = null;
        tour.dd = null;
        tour.ks = null;
        countcanceltour++;
    }
    public int statisticCancelTour(){
        return countcanceltour;
    }
    public int statisticBookTour(){
        return countbooktour;
    }
}


