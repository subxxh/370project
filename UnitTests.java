import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTests {
  
  @Test
  public void testTurnOnAndOff() {
    TV tv = new TV();
    TurnOnCommand turnOnCommand = new TurnOnCommand(tv);
    TurnOffCommand turnOffCommand = new TurnOffCommand(tv);

  
    turnOnCommand.execute();
    assertTrue(tv.isOn(), "TV is on.");

  
    turnOffCommand.execute();
    assertFalse(tv.isOn(), "TV is off.");
  }

  @Test
  public void testVolumeUp() {
    TV tv = new TV();
    VolumeUpCommand volumeUpCommand = new VolumeUpCommand(tv);

    int initialVolume = tv.getVolume();
    volumeUpCommand.execute();
    assertEquals(initialVolume + 1, tv.getVolume(), "Volume increased by 1.");
  }
}


