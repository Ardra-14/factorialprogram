
public class factorial {

    public static int calculator(int num) throws NegativeIntegerExceptions, NonIntegerExceptions {
        if (num <= 0){
            throw new NegativeIntegerExceptions("Entering negative integer is not possible. ");
        }
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }

}

