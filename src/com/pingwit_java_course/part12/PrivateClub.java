package com.pingwit_java_course.part12;

public class PrivateClub extends RegularClub{
    public static final Long SERIAL_VERSION = 666L;
    private final String clubName;
    private final int members;

    public PrivateClub() {
        this.clubName = "Rich Cat";
        this.members = 0;
    }

    private PrivateClub(String clubName) {
        this.clubName = clubName;
        this.members = 0;
    }

    private PrivateClub(String clubName, int members) {
        this.clubName = clubName;
        this.members = members;
    }

    @Override
    public String toString() {
        return "PrivateClub{" +
                "clubName='" + clubName + '\'' +
                ", members=" + members +
                '}';
    }
}