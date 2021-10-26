import java.awt.geom.AffineTransform;

public class Lab3 {
    public static void main(String[] args){
        Horz_Tunnel[][] map = new Horz_Tunnel[3][3];
        Traveller MinionPole = new Traveller();
        MinionPole.change_name("Roman");

        System.out.println(MinionPole.toString());
;

        map[0][1] = new Horz_Tunnel();
        map[1][2] = new Horz_Tunnel(10, new CO2());

        map[0][1].explore(MinionPole);

//        System.out.println(MinionPole.get_XP());
//        System.out.println(MinionPole.get_gold());

        map[1][2].explore(MinionPole);

        System.out.println(MinionPole.us);
    }
}





