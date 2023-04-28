public class myfarm {
    public static void main(String[] args) {
        myfarm charlie = new myfarm();
        plot ryan = new plot();
        ryan.printPlot();


    }


    public plot[][] grid;
    public myfarm() {
        System.out.println("Hello from my amazing farm");
        grid = new plot[4][3];

        for (int p = 0; p < grid.length; p++) {
            for (int h = 0; h < grid[p].length; h++) {
                grid[p][h] = new plot();
                grid[p][h].printPlot();

            }
        }
        totalPlants();
        printplantnames();
    }


        public void totalPlants() {
        //how many plants are in the grid?
        int sumofplants = 0;
        for(int e=0; e<grid.length; e++) {
            for (int c = 0; c < grid[e].length; c++) {
                sumofplants += grid[e][c].numberOfPlant;
            }
        }
            System.out.println("the total number of plants is " +sumofplants);

    }


public void printplantnames(){
        String names;
    for(int r=0; r<grid.length; r++) {
        for (int h = 0; h < grid[r].length; h++) {
            names = grid[r][h].plantName;
            System.out.println("row:" + r + " col:" + h + "  " + names );
        }
}





}

}

