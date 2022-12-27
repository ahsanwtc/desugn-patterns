package state.exercise;

public class Walking implements TravelMode {
  @Override
  public Object getEta() {
    System.out.println("Calculating ETA (walking)");
    return 4;
  }

  @Override
  public Object getDirections() {
    System.out.println("Calculating Direction (walking)");
    return 4;
  }
}
