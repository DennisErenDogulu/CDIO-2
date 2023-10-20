import java.util.random;

Public class Die{
    public int faceValue;
    public Random random = new random();

    public Die(){

    }

    


public int roll(){
    // to change the dice from a six sided dice to the dice you want. Change the value in the () next to nextInt.
    // The value put in the brackets decide which die is used so ie. a six sided die requires 6 in the brackets a 12 sided
    // die requires you to put 12 in the brackets.
    faceValue = random.nextInt(6) + 1;
    
    return faceValue;
}
}