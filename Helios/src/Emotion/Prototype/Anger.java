package Emotion.Prototype;

import Emotion.Emotion;

/**
 * @author Jeremy Koepke
 *
 * Description: Defines the PROTOTYPE emotion Anger.
 */
public class Anger extends Emotion{
    public EmotionType type = EmotionType.PROTOTYPE;

    //Constructs anger emotion.
    public Anger(){
        emotionName = "Anger";
        emotionLevel = 0;
        isActive = false;
    }
}
