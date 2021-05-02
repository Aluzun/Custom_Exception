
public class Test {
    public static void main(String args[]) {
        int a[] = { 12, 4, -5, -8, 99, 25};
        double sumSq;
        
        try {
        sumSq = squareRootSum(a);
        	if(sumSq == Double.NaN)
        		System.out.println("Error: There is negative numbers in the array");
        	else
        		System.out.println("Sum is " + sumSq);
        } catch(IncorrectNumberException e) { System.out.println("Exception Occured" + e);}
    }

    static double squareRootSum(int[] array) throws IncorrectNumberException {
        double sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < 0 ) {
            	throw new IncorrectNumberException("Not Valid");
            }
            else 
                sum += Math.sqrt(array[i]);
        }
    
        return sum;

    }
}

