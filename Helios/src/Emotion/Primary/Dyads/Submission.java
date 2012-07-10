package Emotion.Primary.Dyads;

import Emotion.Emotion;
import Emotion.Prototype.Trust;
import Emotion.Prototype.Fear;

/**
 * @author Jeremy Koepke
 *
 * Defines the PRIMARY DYAD emotion Submission.
 */
public class Submission extends Emotion{
    public EmotionType type = EmotionType.PRIMARY_DYAD;
    public boolean canSetActive;

    //Constructs submission emotion.
    public Submission(){
        emotionName = "Submission";
        emotionLevel = 0;
        isActive = false;
    }

    //Attempts to set submission as an active emotion.
    public void setActive(Trust trust, Fear fear){
        canSetActive(trust, fear);

        if(canSetActive == true){
            setActive();
            System.out.println("Submission was set to Active.");
        } else if(canSetActive == false){
            setDeactive();
            System.out.println("Submission was not set to Active.");
        } else {
            System.out.println("Error in setting Submission as Active.");
        }
    }

    //Tests to see if submission's dependent emotions are active.
    public boolean canSetActive(Trust trust, Fear fear){
        if(trust.isActive == false || fear.isActive == false){
            canSetActive = false;
            return(false);
        } else {
            canSetActive = true;
            return(true);
        }
    }
}