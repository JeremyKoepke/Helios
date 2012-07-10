package Emotion.Prototype;

import Emotion.Emotion;

/**
 * @author Jeremy Koepke
 *
 * Description: Defines the PROTOTYPE emotion Anticipation.
 */
public class Anticipation extends Emotion{
    public EmotionType type = EmotionType.PROTOTYPE;

    //Constructs anticipation emotion.
    public Anticipation(){
        emotionName = "Anticipation";
        emotionLevel = 0;
        isActive = false;
    }
}
