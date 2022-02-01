public class Farm{
    private Animal[] Animals;
    private double availableFood;

    Farm(){
        availableFood = 1000;

        Animals = new Animal[4];
        Animals[0] = new Chicken();
        Animals[1] = new Cow();
        Animals[2] = new Llama();
        Animals[3] = new Llama();
    }
    public void makeNoise(){
        Animal cow = new Cow();
        Animal chicken = new Chicken();
        Animal llama = new Llama();
        llama.sound();
        llama.sound();
        cow.sound();
        chicken.sound();
    }

    public void feedAnimals(){
        for(int i = 0; i < 4; i++){
            if(availableFood >= Animals[i].getMealAmount()){
                availableFood -= Animals[i].eat();
            }else{
               System.out.println("Not enough food!");
            }
        }
    }

    public double getAvailableFood(){return availableFood;}
    public void setAvailableFood(double newAvailableFood){this.availableFood = newAvailableFood;}

    public Animal[] getAnimals(){return Animals;}
}
