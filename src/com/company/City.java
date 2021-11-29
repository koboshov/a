package com.company;



public class City implements  Comparable<City> {
    private int code;
    private String name;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }



    @Override
    public int compareTo(City cod1) {
        if (this.code==cod1.code)
            return 0;
        else if (this.code<cod1.code){
            return -1;
        }else{
            return 1;
        }
    }
}
