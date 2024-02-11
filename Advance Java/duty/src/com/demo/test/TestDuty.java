package com.demo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

 class Duty {
    private String officerName;
    private LocalDate startDate;
    private LocalDate endDate;

    public Duty(String officerName, LocalDate startDate, LocalDate endDate) {
        this.officerName = officerName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getOfficerName() {
        return officerName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}

 class Station {
    private String stationName;
    private List<Duty> duties = new ArrayList<>();

    public Station(String stationName) {
        this.stationName = stationName;
    }

    public void addDuty(Duty duty) {
        duties.add(duty);
    }

    public void removeDuty(Duty duty) {
        duties.remove(duty);
    }

    public List<Duty> getDuties() {
        return duties;
    }

    public void printSchedule() {
        System.out.println("Schedule for " + stationName + ":");
        for (Duty duty : duties) {
            System.out.println(duty.getOfficerName() + " - " + duty.getStartDate() + " to " + duty.getEndDate());
        }
    }
}

 class Schedule {
    private List<Station> stations = new ArrayList<>();

    public void addStation(Station station) {
        stations.add(station);
    }

    public void removeStation(Station station) {
        stations.remove(station);
    }

    public void printSchedule() {
        System.out.println("Overall schedule:");
        for (Station station : stations) {
            station.printSchedule();
        }
    }
}

public class TestDuty {
    public static void main(String[] args) {
        Station station = new Station("Police Station 1");
        station.addDuty(new Duty("Officer 1", LocalDate.of(2021, 1, 1), LocalDate.of(2021, 1, 10)));
        station.addDuty(new Duty("Officer 2", LocalDate.of(2021, 1, 11), LocalDate.of(2021, 1, 20)));
        station.addDuty(new Duty("Officer 3", LocalDate.of(2021, 1, 21), LocalDate.of(2021, 1, 30)));
        Station station2 = new Station("Police Station 2");
        station2.addDuty(new Duty("Officer 4", LocalDate.of(2021, 1, 1), LocalDate.of(2021, 1, 10)));
        station2.addDuty(new Duty("Officer 5", LocalDate.of(2021, 1, 11), LocalDate.of(2021, 1, 20)));
        station2.addDuty(new Duty("Officer 6", LocalDate.of(2021, 1, 21), LocalDate.of(2021, 1, 30)));
        Schedule schedule = new Schedule();
        schedule.addStation(station);
        schedule.addStation(station2);
        schedule.printSchedule();
    }
}

//-----------------------------

//another code

//class HelloWorld {
//    public static void main(String[] args) {
//
//          int numberOfOfficers = 10; // Change this value based on the number of officers
//        int days = 30; // Number of days you want to schedule
//        
//        // Loop through each day
//        for (int day = 1; day <= days; day++) {
//            // Calculate the officer for the current day
//            int officerIndex = (day - 1) % numberOfOfficers;
//            String officerName = "Officer " + (officerIndex + 1);
//            
//            // Print the duty schedule for the current day
//            System.out.println("Day " + day + ": " + officerName + " on duty");
//        }
//
//    }
//}
