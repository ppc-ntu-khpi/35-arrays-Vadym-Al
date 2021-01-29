package domain;

/**
 * Class Calculate realise Armstrong numbers
 * @author Vadym
 */
public class Exercise {
    /**
     * Program use only three int numbers to count
     * @param number - this is your number))
     * @return - true or false
     */
    public static boolean Calculate(int number){
        int[] array;
       int counter=0;
       int buffer=number;
        /**
         * For first we need to find array length
         */
       while (buffer!=0){
           buffer/=10;
           counter++;
       }
       array = new int[counter];
       buffer=number;
       counter=0;
        /**
         * This function multiply each number (array.length) times
         */
        for (int i = 0; i <array.length; i++) {
            array[i]=buffer%10;
            for (int j = 1; j !=array.length; j++) {
                array[i]*=buffer%10;
            }
            counter+=array[i];
            buffer/=10;
        }
        /**
         * return true or false
         */
      return counter==number;
    }
}
