package com.lambdaschool.solution;

public class MyApplication implements Processor
{
   private Athlete athlete;
   private Court court;

    public MyApplication(Athlete athlete)
    {
        this.athlete = athlete;
    }

    public MyApplication(Court court)
    {
        this.court = court;
    }

    @Override
    public void displayAthlete()
    {
        //rules
        System.out.println("************");
        athlete.displayAthlete();
        System.out.println("************\n");

    }

    @Override
    public void displayCourt()
    {
        //rules
        System.out.println("************");
        court.displayCourt();
        System.out.println("************\n");
    }
}
