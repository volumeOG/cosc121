public class Animal{

    //six private attributes
    private String name;
    private double energy;
    private boolean alive = true;
    private double mealAmount;
    private double x,y;
    private double speedX,speedY;

    public String toString(){
        String status = "";
        status = alive ? "alive" : "dead";
        return name + ": " + status + " at (" + x + "," + y + ") Energy = " + getEnergy();
    }
    void move(){
        if(alive){
            x += speedX;
            y += speedY;
            energy -= .1;
        }else{
            System.out.printf("%s can't move. It's dead!", name);
        }
    }
    void speak(String msg){
        if(alive){
            System.out.printf("%s says: %s", name, msg);
        }else{
            System.out.printf("%s can't speak. It's dead!", name);
        }
    }
    void sound(){
        System.out.printf(alive ? "unknown sound" : "");
    }
    public double eat(){
        double unitsEaten = 0;
        if(!alive){
            System.out.printf("%s can't eat. It's dead", name);
        }else if(getEnergy()==100){
            System.out.printf("%s can't eat. It's full!", name);
        }else{
            if(mealAmount+energy > 100){
                unitsEaten = mealAmount-((mealAmount+energy)-100);
                setEnergy(100);
                System.out.printf("%s ate %.2f units, now it is full!\n", getName(), unitsEaten);
            }else {
                setEnergy(getEnergy() + getMealAmount());
                unitsEaten = getMealAmount();
                System.out.printf("%s ate %.2f units\n", getName(), unitsEaten);
                if(getEnergy()==100) System.out.print(", now it is full!");
            }
        }
        return unitsEaten;
    } //returns units eaten by animal

    Animal(){
        energy = 100;
        speedX = 1;
        speedY = 1;
    }//set energy and speedX and speedY

    //getters and setters
    public String getName(){return name;}
    public void setName(String newName){this.name = newName;}

    public double getEnergy(){return energy;}
    public void setEnergy(double newEnergy){
        if(energy > 0 && energy < 100) this.energy = newEnergy;
        if(energy > 17 && energy < 50) System.out.printf("%s is hungry", name);
        if(energy < 17) System.out.printf("%s is starving!", name);

        if(newEnergy < 0) alive = false;
        else if(newEnergy > 0) alive = true;

    }

    public boolean alive(){
        if(energy <= 0) alive = false;
        return alive;
    }

    public double getMealAmount(){return mealAmount;}
    public void setMealAmount(double newMealAmount){this.mealAmount = newMealAmount;}

    public double getX(){return x;}
    public void setX(double newX){this.x = newX;}

    public double getY(){return y;}
    public void setY(double newY){this.y = newY;}

    public double getSpeedX(){return speedX;}
    public void setSpeedX(double newSpeedX){this.speedX = newSpeedX;}

    public double getSpeedy(){return speedY;}
    public void setSpeedY(double newSpeedY){this.speedY = newSpeedY;}
}
