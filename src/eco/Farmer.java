package eco;

public class Farmer {
    
    public static int fPop = 5;
    public static int fHunger;
    public static float rate = fPop;
    
    public static int fHunger(int fPop) { //Returns the total amount of wheat that is needed to feed the farmers.
        
        //fHunger = (Main.randInt(8,10));
        fHunger = 9;
        return fHunger;
        
    }
    
    public static int fPop() { //Returns the number of farmers in existence.
        
        if(Wheat.tWheat < (fHunger * fPop)){
            
            fPop = Wheat.tWheat/fHunger;
            Wheat.tWheat = Wheat.tWheat - (fHunger * fPop);
            if(Wheat.tWheat < 0)
                Wheat.tWheat = 0;
            
        }
        rate = (rate * (1 + Main.fBirthRate - Main.fDeathRate));
		fPop = (int)(rate);
	    return fPop;
        
    }

}
