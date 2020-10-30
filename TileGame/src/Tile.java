import java.util.HashMap;

public class Tile {
    /**
     * constructor
     */
    private int balanceChange;
    private boolean extraTurn;
    private String tileName;
    public Tile(int a, boolean b,String name)
    {
        balanceChange = a;
        extraTurn = b;
        tileName = name;

    }

    public void setBalanceChange(int balanceChange) {
        this.balanceChange = balanceChange;
    }

    public void setExtraTurn(boolean extraTurn) {
        this.extraTurn = extraTurn;
    }

    public int getBalanceChange() {
        return balanceChange;
    }

    public boolean isExtraTurn() {
        return extraTurn;
    }


    /**
     * array of tile list
     * @return returns array of the specified initiated tiles
     */
    public static Tile [] tileListInit(){
        Tile [] tiles = new Tile[16];
        Tile start = new Tile (0,false,"Start");
        Tile tower = new Tile (250,false, "Tower");
        Tile crater = new Tile (-100,false, "Crater");
        Tile palaceGates = new Tile (100,false, "Palace gates");
        Tile coldDesert = new Tile (-20,false, "Cold Desert");
        Tile walledCity = new Tile (180,false, "Walled city");
        Tile monastery = new Tile (0,false, "Monastery");
        Tile blackCave = new Tile (-70,false, "Black cave");
        Tile hutsInTheMountain = new Tile (60,false, "Huts in the woods");
        Tile theWerewall = new Tile (-80,true, "The Werewall");
        Tile thePit = new Tile (-50,false, "The pit");
        Tile goldmine = new Tile (650,false,"Goldmine");

        tiles[1] = start;
        tiles[2] = tower;
        tiles[3] = crater;
        tiles[5] = palaceGates;
        tiles[6] = coldDesert;
        tiles[7] = walledCity;
        tiles[9] = monastery;
        tiles[10] = blackCave;
        tiles[11] = hutsInTheMountain;
        tiles[13] = theWerewall;
        tiles[14] = thePit;
        tiles[15] = goldmine;

        return tiles;
    }
}
