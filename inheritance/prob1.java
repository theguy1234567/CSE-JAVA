//learning inheritance with a SmartDevice controller prog in java
//statement-You are designing a Smart Home Automation System where different smart devices inherit common functionalities from a base class.

class SmartDevice{
    String DeviceName;
    SmartDevice(String DeviceName){
        this.DeviceName = DeviceName;
    }
    void turnOn(){
        System.out.println(DeviceName + "is turned ON");
        
    }
    void turnOff(){
        System.out.println(DeviceName + "is turned Off");

    }

}
class SmartLight extends SmartDevice{
    SmartLight(String name){
        super(name);
        
    }
    @Override
    void turnOn(){
        System.out.println(DeviceName+" (smartlight)is ON with warm lighting");
    }
    void setBrightness(int level){
        System.out.println(DeviceName+"'s brightness is set to "+level+"%");
    }

}
class SmartSpeaker extends SmartDevice{
    SmartSpeaker(String name){
        super(name);
    }
    @Override
    void turnOn(){
        System.out.println(DeviceName+" (smartSpeaker)is ON and ready to play music");
    }
    void playMusic(String song){
        System.out.println(DeviceName+" is playing "+song);
    }


}
class SmartThemostat extends SmartDevice{
    SmartThemostat(String name){
        super(name);
    }
    @Override
    void turnOn(){
        System.out.println(DeviceName+" (smartthermostat)is ON with warm temperatur");
    }
    void setTemp(int temp){
        System.out.println(DeviceName+" temperatur set to"+temp+"c");
    }

}

public class prob1 {

    public static void main(String[] args) {
        SmartDevice[] devices = new SmartDevice[3];
        devices[0] = new SmartLight("Living room");
        devices[1] = new SmartSpeaker("study room");
        devices[2] = new SmartThemostat("home thermostat");
        


        //downcasting
        for (SmartDevice smartDevice : devices) {
            smartDevice.turnOn();
        }
        if(devices[0] instanceof SmartLight){
            SmartLight light = (SmartLight) devices[0];
            light.setBrightness(75);
        }
        if(devices[1] instanceof SmartSpeaker){
            SmartSpeaker speaker = (SmartSpeaker) devices[1];
            speaker.playMusic("jazz classics");
        }
        if(devices[2] instanceof SmartThemostat){
            SmartThemostat thermostat = (SmartThemostat) devices[2];
            thermostat.setTemp(22);
        }


    }
   
    
    
}
