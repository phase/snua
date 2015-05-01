package xyz.jadonfowler.snua.nes.dom;

import java.util.EnumSet;
import java.util.HashMap;

/*
 * Addressing Modes for the NES
 */
public enum AddressingMode {
  IMPLICIT("Implied"),
  ACCUMULATOR("Accumulator"),
  IMMEDIATE("Immediate"),
  ZERO_PAGE("Zero Page"),
  ZERO_PAGE_X("Zero Page,X"),
  ZERO_PAGE_Y("Zero Page,Y"),
  RELATIVE("Relative"),
  ABSOLUTE("Absolute"),
  ABSOLUTE_X("Absolute,X"),
  ABSOLUTE_Y("Absolute,Y"),
  INDIRECT("Indirect"),
  INDIRECT_X("(Indirect,X)"),
  INDIRECT_Y("(Indirect),Y");

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
