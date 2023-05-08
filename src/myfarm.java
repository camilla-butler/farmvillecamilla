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
        //  everyOtherNeedsWater();
        plotwithmaxnumber();
        plantwithmaxnumber();
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

    //public void everyOtherNeedsWater() {



                // change the value of needsWater to be true for every other plot
                // print the value or needs water for all plots row by row

       //     }

          public void plotwithmaxnumber(){
        int maxnumber = grid[0][0].numberOfPlant;
        String name = grid[0][0].plantName;
        for(int b = 0; b< grid.length; b++)
            for(int g=0; g< grid[b].length; g++){
                if(grid[b][g].numberOfPlant>maxnumber) {
                    maxnumber = grid[b][g].numberOfPlant;
                    name = grid[b][g].plantName;


                }




            }
              System.out.println( name +" has the most plants with a total of  " + maxnumber +" plants");

          }
    public void plantwithmaxnumber() {
        int numCorn = 0;
        int numTomato = 0;
        int numCarrot = 0;
        int numSunflower = 0;


        for (int b = 0; b < grid.length; b++)
            for (int g = 0; g < grid[b].length; g++) {
                switch (grid[b][g].plantName) {
                    case "corn":
                        numCorn += grid[b][g].numberOfPlant;
                        break;
                    case "tomato":
                        numTomato += grid[b][g].numberOfPlant;
                        break;
                    case "Sunflower":
                        numSunflower += grid[b][g].numberOfPlant;
                        break;
                    default:
                        numCarrot += grid[b][g].numberOfPlant;
                        break;
                }
                if (numCorn > numCarrot && numCorn > numSunflower && numCorn > numTomato) {
                    System.out.println("Corn has the most plants with " + numCorn + " plants");


                }
                if (numTomato > numCarrot && numTomato > numSunflower && numTomato > numCorn) {
                    System.out.println("Tomato has the most plants with " + numTomato + " plants");


                }
                if (numSunflower > numCarrot && numSunflower > numCorn && numSunflower > numTomato) {
                    System.out.println("Sunflower has the most plants with " + numSunflower + " plants");

                }
                else{
                    System.out.println("idk what plant has the most");
                }
            }
    }

    }





