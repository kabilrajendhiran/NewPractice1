package com.company.demo.l2;

public class PetrolBunk {

    public void findSolution(int c,int[] p, int [] d)
    {

        for (int i = 0; i < p.length; i++) {
            int travel = d[i];
            if(travel<c)
            {
                c = c -travel + p[i];
            }
            else
            {
                System.out.println("Need "+ (travel-c)+" more litres of petrol");
                return;
            }
        }

        System.out.println("Petrol remaining in car "+ c);
    }

}
