package com.lambdaschool.solution;

public class MyApplication implements Processor
{
   private Athlete athlete;

    public MyApplication(Athlete athlete)
    {
        this.athlete = athlete;
    }

    @Override
    public void displayAthlete()
    {
        //rules
        System.out.println("************");
        athlete.displayAthlete();
        System.out.println("************\n");

    }
}
