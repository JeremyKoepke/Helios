package Aurora;

import Emotion.Emotion;
import Emotion.Prototype.*;
import Emotion.Primary.Dyads.*;

/**
 * @author Jeremy Koepke
 */
public class Aurora {
    //Default emotion.

    Emotion blank = new Emotion();
    //Prototype emotions.
    Anger anger = new Anger();
    Anticipation anticipation = new Anticipation();
    Disgust disgust = new Disgust();
    Fear fear = new Fear();
    Joy joy = new Joy();
    Sadness sadness = new Sadness();
    Surprise surprise = new Surprise();
    Trust trust = new Trust();
    //Primary emotional dyads.
    Aggression aggression = new Aggression();
    Alarm alarm = new Alarm();
    Contempt contempt = new Contempt();
    Disappointment disappointment = new Disappointment();
    Love love = new Love();
    Optimism optimism = new Optimism();
    Remorse remorse = new Remorse();
    Submission submission = new Submission();

    //Secondary emotional dyads.
    public static void main(String[] args){
        
    }
}