package com.example.pages;

public class Location {
    private String location;
    private String locationcur;
    private int cv;

    public Location() {
    }

    public Location(String location,int cv,String locationcur) {
        this.location = location;
        this.cv=cv;
        this.locationcur = locationcur;
    }

    public String getLocation() {
        return location;
    }
    public String getLocationCur() {
        return locationcur;
    }
    public int getCv(){
        return cv;
    }
    public void setCv(int cv) {
        this.cv = cv;
    }
    public void setLocation(String location) {
        this.locationcur = locationcur;
    }
    public void setLocationCur(String location) {
        this.locationcur = locationcur;
    }

}

/*

public class Location {
    private String n;
    private String m;
    private String p;
    public Location() {
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }
}
*/