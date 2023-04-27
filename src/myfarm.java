public class myfarm {
    public static void main(String[] args) {
        myfarm charlie = new myfarm();
        plot ryan = new plot();
        ryan.printPlot();


    }
    public plot[][] grid;
    public myfarm() {
        System.out.println("Hello from my amazing farm");

        grid = new plot[10][10];

        for (int p = 0; p < grid.length; p++) {
            for (int h = 0; h < grid[p].length; h++) {
                grid[p][h] = new plot();
                grid[p][h].printPlot();

            }
        }
        totalPlants();
    }


        public void totalPlants() {
        //how many plants are in the grid?
        System.out.print("the total number of plants is " + grid);
    }




}

