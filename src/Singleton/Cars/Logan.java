package Singleton.Cars;

public class Logan implements Car{

    private boolean repaired;

    public Logan(boolean repaired) {
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
        return "Logan";
    }



}
