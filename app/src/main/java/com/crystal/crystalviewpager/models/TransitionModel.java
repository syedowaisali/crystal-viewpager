package com.crystal.crystalviewpager.models;

/**
 * Created by owais.ali on 8/2/2016.
 */
public class TransitionModel {

    private int id;
    private String name;

    public TransitionModel setTransitionId(final int id){
        this.id = id;
        return this;
    }

    public TransitionModel setTransitionName(final String name){
        this.name = name;
        return this;
    }

    public int getTransitionId(){
        return this.id;
    }

    public String getTransitionName(){
        return this.name;
    }
}

