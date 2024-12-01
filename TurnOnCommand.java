
public class TurnOnCommand implements Command {
    private TV tv;
    public TurnOnCommand(TV tv) {
      this.tv = tv;
    }
    public void execute() {
      tv.TurnOn();
    }
  }
  
     class TurnOffCommand implements Command {
      private TV tv;
      public TurnOffCommand(TV tv) {
        this.tv = tv;
      }
      public void execute() {
        tv.TurnOff();
      }
  }
  
  class VolumeUpCommand implements Command {
      private TV tv;
      public VolumeUpCommand(TV tv) {
        this.tv = tv;
      }
      public void execute() {
        tv.VolumeUp();
      }
  }
  
  class VolumeDownCommand implements Command {
      private TV tv;
      public VolumeDownCommand(TV tv) {
        this.tv = tv;
      }
      public void execute() {
        tv.VolumeDown();
      }
  }
  
  class NextChannelCommand implements Command {
    private TV tv;
    public NextChannelCommand(TV tv) {
      this.tv = tv;
    }
  public void execute() {
    tv.NextChannel();
  }
  }
  
  class PrevChannelCommand implements Command {
    private TV tv;
    public PrevChannelCommand(TV tv) {
      this.tv = tv;
    }
  public void execute() {
    tv.PreviousChannel();
  }
  }
