package Singleton.Cars;

public class BMW implements Car{

    private boolean repaired;

    public BMW(boolean repaired) {
        this.repaired = repaired;
    }

    @Override
    public boolean isRepaired() {
        return repaired;
    }

    @Override
    public void setRepaired(boolean repaired) {
        this.repaired = repaired;
    }


    @Override
    public String name(){
        return "BMW";
    }
}
