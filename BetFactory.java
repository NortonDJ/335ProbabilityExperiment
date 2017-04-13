
/**
 * Write a description of class BetFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BetFactory
{
    public static SingleBet makeSingleBet(Gambler g, int amount){
        Wheel w = CasinoComponents.getInstance().getWheel();
        if(w == null){
            return null;
        } else {
            WheelSpace space = w.randomlySelectSpace();
            return new SingleBet(g,amount,space);
        }
    }
    
    public static RedBet makeRedBet(Gambler g, int amount){
        return new RedBet(g, amount);
    }
    
    public static BlackBet makeBlackBet(Gambler g, int amount){
        return new BlackBet(g, amount);
    }
    
    public static OddBet makeOddBet(Gambler g, int amount){
        return new OddBet(g, amount);
    }
    
    public static EvenBet makeEvenBet(Gambler g, int amount){
        return new EvenBet(g, amount);
    }
    
    public static LineBet makeLineBet(Gambler g, int amount, int lineNum){
            Wheel w = CasinoComponents.getInstance().getWheel();
        switch(lineNum){
            case 1: return new LineBet(g, amount, w.getLine1());
            case 2: return new LineBet(g, amount, w.getLine2());
            default : return new LineBet(g, amount, w.getLine3());
        }
    }
    
    public static ContainsBet makeContainsBet(Gambler g, int amount, int groupNum){
                    Wheel w = CasinoComponents.getInstance().getWheel();
        switch(groupNum){
            case 1: return new ContainsBet(g, amount, w.getFirstHalf());
            default : return new ContainsBet(g, amount, w.getSecondHalf());
        }
    }
    
    public static GroupBet makeGroupBet(Gambler g, int amount, int groupNum){
        Wheel w = CasinoComponents.getInstance().getWheel();
        switch(groupNum){
            case 1 : return new GroupBet(g, amount, w.getFirstThird());
            case 2 : return new GroupBet(g, amount, w.getSecondThird());
            default : return new GroupBet(g, amount, w.getThirdThird());
        }
    }
}
