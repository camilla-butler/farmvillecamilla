public class plot {
    public String plantName;
    public int numberOfPlant;
    public boolean needsWater;
    public plot(){
      //  plantName = "basil";
        needsWater = true;
        numberOfPlant =  (int)(Math.random() * 100) +10;
        int num = (int)(Math.random() *5);
        if (num == 0) {
            plantName = "sunflower";
        }
            if (num == 1) {
                plantName = "corn";
            }
            if (num == 2){
                plantName = "basil";
        }
    }

}