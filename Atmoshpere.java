abstract class Atmoshpere implements Hurt{
    private double Ro;
    private String smells;

    Atmoshpere() {
        Ro = 0;
        smells = "";
    }

    Atmoshpere(double x, String y) {
        Ro = x;
        smells = y;
    }


    public abstract boolean BreathOk();

    public boolean death_comes(){
        if(BreathOk())
            return false;
        else
            return true;
    }

    public double Get_Ro(){
        return Ro;
    }

    public String Get_Smells(){
        return smells;
    }

    public void Update_Ro(int x){
        Ro = x;
    }

    public void Update_Smells(String s){
        smells = s;
    }
}

class Air extends Atmoshpere{
    Air(){
        super(1.29, "nothing");
    }

    public boolean BreathOk(){
        return true;
    }
}

class H2S extends Atmoshpere{
    H2S(){
        super(1.52, "rotten_meat");
    }

    public boolean BreathOk(){
        return false;
    }
}

class CO2 extends Atmoshpere{
    CO2(){
        super(1.52, "sour");
    }

    public boolean BreathOk(){
        return false;
    }
}
