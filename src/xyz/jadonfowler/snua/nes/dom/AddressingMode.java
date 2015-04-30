package xyz.jadonfowler.snua.nes.dom;

import java.util.EnumSet;
import java.util.HashMap;

/*
 * Addressing Modes for the NES
 */
public enum AddressingMode {

  ;

  private static HashMap<String, AddressingMode> modeMap = new HashMap<String, AddressingMode>;

  private final String name;

  static {
    for(AddressingMode m : EnumSet.allOf(AddressingMode.class)){
      modeMap.put(m.name, m);
    }
  }

  AdressingMode(String s){
    name = s;
  }

  public static AddressingMode get(String name){
    return modeMap.get(name);
  }

  public String getName(){
    return name;
  }

}
