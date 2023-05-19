import java.util.ArrayList;

public class MyFarmArrayList {
    public ArrayList<plot> row = new ArrayList<plot>();
    public plot[] arr = new plot[10];

    public MyFarmArrayList() {
        System.out.println("my farm using array list");

        arr[0] = new plot();
        for (int p = 0; p < 10; p++) {
            System.out.println(row.size());
            row.add(new plot());
            row.get(p).printPlot();


        }
        row.add(new plot());

        System.out.println(row.size());


        printPlantName();
        totalPlants();
        addSunflower();
        printPlantName();
        addcorn();
        printPlantName();
    }


    public void totalPlants() {

        int total = 0;

        for (plot a : row) {
            total += a.numberOfPlant;
        }

        System.out.println("total plant in my farm is " + total);

    }

    public void printPlantName() {
        for (int k = 0; k < row.size(); k++) {
            System.out.print(k + ":" + row.get(k).plantName + "\t");
        }
        System.out.println(" ");
    }

    public void addSunflower() {
        plot sunflower = new plot();
        sunflower.plantName = "sunflower";
        sunflower.numberOfPlant = 42;
        sunflower.needsWater = true;

        sunflower.printPlot();
        row.add(sunflower);

    }

    public void addcorn() {
        plot corn = new plot();
        corn.plantName = "corn";
        corn.numberOfPlant = 70;
        corn.needsWater = false;
        corn.printPlot();
        row.add(3,corn);

    }
}


