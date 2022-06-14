package classroomFour;

import java.time.LocalDate;

public class Auto {
    String razotajs;
    String modelis;
    int izlaidumaGads;
    int nobraukums;
    int cena;
    double dzinejaTilpums;
    String dzinejaTips;
    boolean vaiIrTA;

    Auto(String razotajs,int izlaidumaGads, int nobraukums, int cena){
        this.razotajs = razotajs;
        this.izlaidumaGads =izlaidumaGads;
        this.nobraukums = nobraukums;
        this.cena = cena;

        }

    public void printetParametrus(){
        System.out.println("Auto ražotajs ir " + razotajs + " Modelis: " + modelis + " Izlaiduma gads: "+ izlaidumaGads + "un gadu veca " + autoVecums());
    }

    public int autoVecums()
    {
        LocalDate date = LocalDate.now();
        return (date.getYear() - izlaidumaGads);
    }


}
