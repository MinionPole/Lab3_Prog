class Tunnel implements travel, Hurt{
    protected Atmoshpere around;
    Tunnel(){
        around = new Air();
    }

    Tunnel(Atmoshpere x){
        around = x;
    }

    public boolean death_comes(){
        return around.death_comes();
    }

    public void explore(Traveller a){
        if(!around.death_comes()){
            a.random_gold();
            a.random_XP();
        }
        else{
            a.swap_suc();
//            System.out.print("AAAAA");
        }
    }
}


class Horz_Tunnel extends Tunnel{
    private int length;
    Horz_Tunnel(){
        super();
        length = 10;
    }

    Horz_Tunnel(int x, Atmoshpere y){
        super(y);
        length = x;
    }

    public boolean death_comes(){
        return (around.death_comes()) || (length > 100);
    }
}
