package com.example.networking;

                  // ny klass
public class Mountain {
    private String name;

    public  Mountain (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
        public String toString() {
            return "Mountain (name='" + name + "')";
    }
}


