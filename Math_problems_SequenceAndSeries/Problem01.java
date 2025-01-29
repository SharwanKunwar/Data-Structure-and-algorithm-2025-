package Math_problems_SequenceAndSeries;

//Author: Sharwan jung kunwar
//Purpose: If the 5th and the 10th term of a GP are 32 and 1024 respectively, find the first term and the common ration.


public class Problem01 {
    public static void main(String[] args)
    {
        //variable declaration
        int term5 = 32;
        int term10 = 1024;

        // Finding a common ratio
        double r = Math.pow((double) term10 / term5, 1.0 / 5);

        // Finding first term
        double a = term5 / Math.pow(r, 4);

        // Displaying the results
        System.out.println("First term (a): " + a);
        System.out.println("Common ratio (r): " + r);






    }
}
