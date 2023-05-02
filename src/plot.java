public class plot {
    public String plantName;
    public int numberOfPlant;
    public boolean needsWater;



    public plot(){
      //  plantName = "basil";
        needsWater = false;
        numberOfPlant =  (int)(Math.random() * 100) +10;
        int num = (int)(Math.random() *5);
        if (num == 0) {
            plantName = "sunflower";
        }
       else if (num == 2){
            plantName = "basil";
        }
        else if (num == 3){
            plantName = "carrot";
        }
       else if (num == 4){
            plantName = "tomato";
        }
       else{
           plantName = "empty";
           numberOfPlant = 0;
        }

    }
public void printPlot(){
    System.out.println("the plot has " + numberOfPlant + " of "+ plantName+ " and it is " + needsWater + " that the plant needs water");

}
}
