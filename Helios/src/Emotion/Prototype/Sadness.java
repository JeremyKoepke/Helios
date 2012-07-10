package Emotion.Prototype;

import Emotion.Emotion;

/**
 * @author Jeremy Koepke
 *
 * Description: Defines the PROTOTYPE emotion Sadness.
 */
public class Sadness extends Emotion{
    public EmotionType type = EmotionType.PROTOTYPE;

    //Constructs sadness emotion.
    public Sadness(){
        emotionName = "Sadness";
        emotionLevel = 0;
        isActive = false;
    }
}
