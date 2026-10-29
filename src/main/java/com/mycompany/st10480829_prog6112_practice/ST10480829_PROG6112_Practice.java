package com.mycompany.st10480829_prog6112_practice;

public class ST10480829_PROG6112_Practice {

    public static void main(String[] args) 
    {
        //Q1.1
         //1D array - Store the quarter headings
        String [] season = {"Summer", "Autumn", "Winter", "Spring"};
      
        //1D arry - Stores the year headings
        String [] years = {"YEAR 1", "YEAR 2"}; 
        
        //2D array - Store the product sales across the year & quarter
        //Each ROW represent a year
        //Each COLUMN represent a quarter
        int [][] ticketSales = 
        {
            {420, 310, 180, 390},
            {450, 280, 220, 390}
        };
        
        // * ticketSales sales = new ticketSales();
        
        // -----------------------------------------------------
        // DISPLAY SALES TABLE
        // -----------------------------------------------------

        System.out.println("THEATRE TICKET SALES REPORT - 2026");
        System.out.println("---------------------------------------------");

        // Print blank space before the quarter headings.
        System.out.printf("%-12s", "");

        // Print each quarter heading.
        for (int col = 0; col < season.length; col++) {
            System.out.printf("%-12s", season[col]);
        }

        System.out.println();


        // Print each year and its sales values.
        for (int row = 0; row < ticketSales.length; row++) {

            // Print the current year.
            System.out.printf("%-12s", years[row]);

            // Print the sales values for the current year.
            for (int col = 0; col < ticketSales[row].length; col++) {
                System.out.printf("%-12d", ticketSales[row][col]);
            }

            System.out.println();
        }


        // -----------------------------------------------------
        // DISPLAY CALCULATED RESULTS
        // -----------------------------------------------------

        System.out.println();
        System.out.println("--------------------------------");

        // Call methods from the ProductSales object.
        System.out.println(
                "Total sales:   " + sales.TotalSales(ticketSales)
        );

        // %.0f rounds the displayed average to zero decimal places,
        // matching the sample report where 366.67 displays as 367.
        System.out.printf(
                "Average sales: %.0f%n",
                sales.AverageSales(ticketSales)
        );

        System.out.println(
                "Maximum sale:  " + sales.MaxSale(ticketSales)
        );

        System.out.println(
                "Minimum sale:  " + sales.MinSale(ticketSales)
        );
    }
    }
}
