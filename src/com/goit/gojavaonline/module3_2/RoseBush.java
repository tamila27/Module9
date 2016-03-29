package com.goit.gojavaonline.module3_2;

import java.util.ArrayList;
import java.util.List;

public class RoseBush {
    private List<Rose> roses;

    public List<Rose> getRoses() {
        if(roses == null)
            new ArrayList<Rose>();
        return roses;
    }

    public void setRoses(List<Rose> roses) {
        this.roses = roses;
    }

    public boolean hasRoses(){
        boolean hasRoses = false;
        if(getRoses()!= null && getRoses().size() > 0 ){
            hasRoses = true;
        }

        return hasRoses;
    }

    public void addRose(Rose rose){
        if(!hasRoses()){
            setRoses(new ArrayList<>());
        }
        roses.add(rose);
        System.out.println(rose.getFlowerColor() + " rose was successfully added to the rosebush.");
    }

    public void removeRose(Rose rose){
        if(hasRoses() && rose != null){
            for(Rose roseOnBush: getRoses()){
                if(roseOnBush.equals(rose)){
                    getRoses().remove(rose);
                    System.out.println(rose.getFlowerColor() + " rose was successfully removed from the rosebush.");
                    break;
                }
            }
        }
    }

    public Rose getRoseByIndex(int roseIndex){
        Rose rose;
        if(roseIndex < 0 || roseIndex >= roses.size() || !hasRoses() ){
            rose = null;
        } else {
            rose = roses.get(roseIndex);
        }
        return rose;
    }
}
