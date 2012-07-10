package Emotion.Primary.Dyads;

import Emotion.Emotion;
import Emotion.Prototype.Anticipation;
import Emotion.Prototype.Joy;

/**
 * @author Jeremy Koepke
 *
 * Defines the PRIMARY DYAD emotion Optimism.
 */
public class Optimism extends Emotion{
    public EmotionType type = EmotionType.PRIMARY_DYAD;
    public boolean canSetActive;

    //Constructs optimism emotion.
    public Optimism(){
        emotionName = "Optimism";
        emotionLevel = 0;
        isActive = false;
    }

    //Attempts to set optimism as an active emotion.
    public void setActive(Anticipation anticipation, Joy joy){
        canSetActive(anticipation, joy);

        if(canSetActive == true){
            setActive();
            System.out.println("Optimism was set to Active.");
        } else if(canSetActive == false){
            setDeactive();
            System.out.println("Optimism was not set to Active.");
        } else {
            System.out.println("Error in setting Optimism as Active.");
        }
    }

    //Tests to see if optimism's dependent emotions are active.
    public boolean canSetActive(Anticipation anticipation, Joy joy){
        if(anticipation.isActive == false || joy.isActive == false){
            canSetActive = false;
            return(false);
        } else {
            canSetActive = true;
            return(true);
        }
    }
}