package Observer;

import java.util.*;

public class SensorSystem {
    private ArrayList<AlarmListener> listeners = new ArrayList<>();

    public void register(AlarmListener alarmListener){
        listeners.add(alarmListener);
    }

    public void soundTheAlarm(){
        for (AlarmListener alarmListener : listeners) {
            alarmListener.alarm();
        }
    }


}
