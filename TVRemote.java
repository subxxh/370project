public class TVRemote{
    private Command command;
    
    public void setCommand(Command command){
      this.command = command;
    }
  
    public void Button() {
      if(command != null) {
        command.execute();
      }
    }
  }