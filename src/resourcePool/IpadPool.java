package resourcePool;

import java.util.ArrayList;

public class IpadPool {

    static int initialSize = 5;

    static ArrayList<Ipad> ipadList = new ArrayList<Ipad>(initialSize);

    public static void expendPool(){

        boolean allOcupied = true;

        for (Ipad ipad:ipadList) {
            allOcupied  = allOcupied && ipad.occupied;
        }

        if(allOcupied){
            ipadList.add(new Ipad());
        }

    }


}
