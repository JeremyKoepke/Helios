package Emotion.Primary.Dyads;

import Emotion.Emotion;
import Emotion.Prototype.Sadness;
import Emotion.Prototype.Disgust;

/**
 * @author Jeremy Koepke
 *
 * Defines the PRIMARY DYAD emotion Remorse.
 */
public class Remorse extends Emotion{
    public EmotionType type = EmotionType.PRIMARY_DYAD;
    public boolean canSetActive;

    //Constructs remorse emotion.
    public Remorse(){
        emotionName = "Remorse";
        emotionLevel = 0;
        isActive = false;
    }

    //Attempts to set remorse as an active emotion.
    public void setActive(Sadness sadness, Disgust disgust){
        canSetActive(sadness, disgust);

        if(canSetActive == true){
            setActive();
            System.out.println("Remorse was set to Active.");
        } else if(canSetActive == false){
            setDeactive();
            System.out.println("Remorse was not set to Active.");
        } else {
            System.out.println("Error in setting Remorse as Active.");
        }
    }

    //Tests to see if remorse's dependent emotions are active.
    public boolean canSetActive(Sadness sadness, Disgust disgust){
        if(sadness.isActive == false || disgust.isActive == false){
            canSetActive = false;
            return(false);
        } else {
            canSetActive = true;
            return(true);
        }
    }
}