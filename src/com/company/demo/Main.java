package com.company.demo;

import com.company.demo.l2.*;
import com.company.demo.l3.taxiapp.Customer;
import com.company.demo.l3.taxiapp.Taxi;
import com.company.demo.l3.taxiapp.TaxiCore;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RunLengthDecoding runLengthEncoding = new RunLengthDecoding();
        runLengthEncoding.decode("a1b10$");
        System.out.println();

        int[] arr = {1,2,3,4,5,6,7,8,9};
        ArraySortASCDES ascdes = new ArraySortASCDES();
        ascdes.findSolution(arr);

        XPrintPattern xPrintPattern = new XPrintPattern();
        xPrintPattern.printPattern("1234567");

        SubString ss = new SubString();
        ss.findSolution("testtest123test","123");

        UnionArray unionArray = new UnionArray();
        int[] a = {2,4,5,6,7,9,10,13};
        int[] b = {2,3,4,5,6,7,8,9,11,15};
        unionArray.findSolution(a,b);

        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseWords("I Love India",0,""));


        int[] arrs = {1,2,3,4,5,6,7};
        AlternativeSorting as= new AlternativeSorting();
        as.findSolution(arrs);
        as.findSolution(a);

        AlternativeSortingNew asn = new AlternativeSortingNew();

        //7 1 6 2 5 3 4
        asn.sortArr(arrs);
        asn.sortArr(a);

        ScrapBook scrapBook = new ScrapBook();
        scrapBook.findSolution();

        OddNumbers oddNumbers  = new OddNumbers();
        oddNumbers.findSolution(2,15);

        SayPatternPrinting spp = new SayPatternPrinting();
        spp.findSolution(7);

        PetrolBunk pb = new PetrolBunk();
        int[] d = {1,12,3};
        int[] c = {6,4,2};

        pb.findSolution(2,c,d);


        ExcelSheet es = new ExcelSheet();
        es.findSolution(260);

        MaximumPathSum maximumPathSum = new MaximumPathSum();

        int grid[][] = {
                    {65, 75, 100, 12},
                    {14, 95, 5, 15},
                    {105, 15, 35, 30},
                    {5, 12, 100, 50}
                };
        maximumPathSum.MaximumPath(grid);

        ArrayList<Taxi> taxis = new ArrayList<>();
        Taxi taxi1 = new Taxi("Taxi-1");
        Taxi taxi2 = new Taxi("Taxi-2");
        Taxi taxi3 = new Taxi("Taxi-3");
        Taxi taxi4 = new Taxi("Taxi-4");

        taxis.add(taxi1);
        taxis.add(taxi2);
        taxis.add(taxi3);
        taxis.add(taxi4);

        TaxiCore taxiCore = new TaxiCore(taxis);

        taxiCore.allocateTaxi(new Customer("C1",'A','C',9));
        taxiCore.allocateTaxi(new Customer("C2",'A','C',9));
        taxiCore.allocateTaxi(new Customer("C3",'A','C',9));
        taxiCore.allocateTaxi(new Customer("C4",'A','C',9));
        taxiCore.allocateTaxi(new Customer("C5",'D','B',14));
        taxiCore.allocateTaxi(new Customer("C6",'B','D',19));

        PrintMirrorPattern pmp  = new PrintMirrorPattern();
        pmp.findSolution(4);

        SnakePattern sp = new SnakePattern();
        sp.findSolution(4);

    }
}
