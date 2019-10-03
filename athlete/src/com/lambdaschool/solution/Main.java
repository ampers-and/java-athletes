package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Hockey Athlete
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();


        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();


        //STRETCH

        CourtInjector courtInjector;

        // Create a Track Court
        courtInjector = new TrackCourtInjector();
        app = courtInjector.getProcess();
        app.displayCourt();

        // Create a Hockey Court
        courtInjector = new HockeyCourtInjector();
        app = courtInjector.getProcess();
        app.displayCourt();

        // Create a Rugby Court
        courtInjector = new RugbyCourtInjector();
        app = courtInjector.getProcess();
        app.displayCourt();

        // Create a Baseball Court
        courtInjector = new BaseballCourtInjector();
        app = courtInjector.getProcess();
        app.displayCourt();

    }
}
