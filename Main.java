// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
     TV tv = new TV();
      
      Command turnOn = new TurnOnCommand(tv);
      Command turnOff = new TurnOffCommand(tv);
      Command VolumeUp = new VolumeUpCommand(tv);
      Command VolumeDown = new VolumeDownCommand(tv);
      Command nextChannel = new NextChannelCommand(tv);
      Command prevChannel = new PrevChannelCommand(tv);
  
      TVRemote remote = new TVRemote(); 
      
      remote.setCommand(turnOn);
      remote.Button();
  
      remote.setCommand(VolumeUp);
      remote.Button();
      remote.Button();
  
      remote.setCommand(nextChannel);
      remote.Button();
  
      remote.setCommand(turnOff);
      remote.Button();
   
  /*
      TV tv = new TV();
      tv.TurnOn();
      if (tv.isOn()) {
        System.out.println("Test Passed. Tv is on");
      } else {
        System.out.println("Test failed. uh oh!");
        
    }
  */
    // @Test
    // void addition() {
    //     assertEquals(2, 1 + 1);
    // }
   } } 