package Emotion.Prototype;

import Emotion.Emotion;

/**
 * @author Jeremy Koepke
 *
 * Description: Defines the PROTOTYPE emotion Trust.
 */
public class Trust extends Emotion{
    public EmotionType type = EmotionType.PROTOTYPE;

    //Constructs trust emotion.
    public Trust(){
        emotionName = "Trust";
        emotionLevel = 0;
        isActive = false;
    }
}