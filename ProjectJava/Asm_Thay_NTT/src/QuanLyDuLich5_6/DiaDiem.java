package QuanLyDuLich5_6;

public class DiaDiem {
    private String diadiem;
    public static int countlocation = 0;
    public DiaDiem (String diadiem){
        this.diadiem = diadiem;
        countlocation++;
    }

    public int statisticLocation(){
        return countlocation;
    }

}
