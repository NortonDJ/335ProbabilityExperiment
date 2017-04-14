import java.util.Random;
/**
 * Write a description of class DefaultStrategy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DefaultStrategy extends BettingStrategy
{
    public DefaultStrategy(Gambler gambler){
        super(gambler);
    }

    public Bet choose(){
        int choice = randomPick(0,49, new Random());
        int amount = randomPick(1, gambler.getBalance(), new Random());
        gambler.removeBalance(amount);
        switch(choice){
            case 0: return BetFactory.makeRedBet(gambler, amount);
            case 1: return BetFactory.makeBlackBet(gambler, amount);
            case 2: return BetFactory.makeEvenBet(gambler, amount);
            case 3: return BetFactory.makeOddBet(gambler, amount);
            case 4: return BetFactory.makeContainsBet(gambler, amount, 1);
            case 5: return BetFactory.makeContainsBet(gambler, amount, 2);
            case 6: return BetFactory.makeLineBet(gambler, amount, 1);
            case 7: return BetFactory.makeLineBet(gambler, amount, 2);
            case 8: return BetFactory.makeLineBet(gambler, amount, 3);
            case 9: return BetFactory.makeGroupBet(gambler, amount, 1);
            case 10: return BetFactory.makeGroupBet(gambler, amount, 2);
            case 11: return BetFactory.makeGroupBet(gambler, amount, 3);
            default: return BetFactory.makeSingleBet(gambler, amount);
        }
    }

    public int randomPick(int aStart, int aEnd, Random aRandom){
        if(aStart > aEnd){
            throw new IllegalArgumentException("Start cannot exceed End.");
        }
        //get the range, casting to long to avoid overflow problems
        long range = (long)aEnd - (long)aStart + 1;
        // compute a fraction of the range, 0 <= frac < range
        long fraction = (long)(range * aRandom.nextDouble());
        int randomNumber =  (int)(fraction + aStart);
        return randomNumber;
    }   
}
