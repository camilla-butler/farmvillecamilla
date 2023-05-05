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
        totalCarrots();
        averagenumberofplants();
        everyOtherNeedsWater();
    }


    public void totalPlants() {
        //how many plants are in the grid?
        int sumofplants = 0;
        for (int e = 0; e < grid.length; e++) {
            for (int c = 0; c < grid[e].length; c++) {
                sumofplants += grid[e][c].numberOfPlant;
            }
        }
        System.out.println("the total number of plants is " + sumofplants);

    }


    public void printplantnames() {
        String names;
        for (int r = 0; r < grid.length; r++) {
            for (int h = 0; h < grid[r].length; h++) {
                names = grid[r][h].plantName;
                System.out.println("row:" + r + " col:" + h + "  " + names);
            }
        }


    }

    public void totalCarrots() {
        int sumofcarrots = 0;
        for (int h = 0; h < grid.length; h++) {
            for (int k = 0; k < grid[h].length; k++) {
                if (grid[h][k].plantName.equals("carrot")) {
                    sumofcarrots += grid[h][k].numberOfPlant;
                }
            }
        }
        System.out.println("the total carrots are " + sumofcarrots);
    }

    public void averagenumberofplants() {
        int sumofplants = 0;
        for (int e = 0; e < grid.length; e++) {
            for (int c = 0; c < grid[e].length; c++) {
                sumofplants += grid[e][c].numberOfPlant;


            }
        }

        System.out.println("the average number of plants is " + sumofplants / (grid.length * grid[0].length));
    }

    public void everyOtherNeedsWater() {



                // change the value of needsWater to be true for every other plot
                // print the value or needs water for all plots row by row

            }

        }









