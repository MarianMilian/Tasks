package java_may_08._1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ZooClub {
  private String name ;
  private Map<Person, List<Pet>> map;
  public ZooClub(String name, Map<Person, List<Pet>> map) {
    this.name = name;
    this.map = map;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Map<Person, List<Pet>> getMap() {
    return map;
  }

  public void setMap(Map<Person, List<Pet>> map) {
    this.map = map;
  }
}
