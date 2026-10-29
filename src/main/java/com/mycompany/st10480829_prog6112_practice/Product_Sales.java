package com.mycompany.st10480829_prog6112_practice;

public interface Product_Sales 
{
       int[][] GetMarks(); //2d array return the grades captured

    int GetTotalMarks();

    double GetAverageMarks();

    int GetPassCount(); //scored >50

    int GetFailCount(); //scored <50

    int GetStudentsProcessed();
}
