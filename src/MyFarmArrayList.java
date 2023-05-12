import java.util.ArrayList;

public class MyFarmArrayList {
public ArrayList<plot> row = new ArrayList<plot>();
public plot[] arr = new plot[10];
    public MyFarmArrayList(){
        System.out.println("my farm using array list");

        arr[0] = new plot();
        for(int p = 0; p<10; p++){
            System.out.println(row.size());
            row.add(new plot());
            row.get(p).printPlot();



        }
        row.add(new plot());
    }
}

