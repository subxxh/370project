public class TV {
    private int volume = 50;
    private int channel = 10;
    public boolean isOn = false;
  
    public void TurnOn() {
      isOn = true;
      System.out.println("TV is on.");
    }
  
    public void TurnOff() {
      isOn = false;
      System.out.println("TV is turned off.");
    }
  
    public void VolumeUp() {
      volume++;
      System.out.println("Volume is increased to " + volume);
    }
  
    public void VolumeDown() {
      if (volume > 0) {
      volume--;
      }
      System.out.println("Volume is decreased to " + volume);
    }
  
    public void NextChannel() {
      channel++;
        System.out.println("Channel " + channel);
    }
  
    public void PreviousChannel() {
      if (channel > 1) {
        channel--;
      }
      System.out.println("Channel" + channel);
    }
  
    public boolean isOn() {
      return isOn;
    }
  
    public int getVolume() {
      return volume;
    }
    
  }