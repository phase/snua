package xyz.jadonfowler.snua.nes.system.cpu;

/**
 * Interface for the CPU, so we can use different variants of it.
 */
public interface ICPU {

  void reset();

  void runStep();

  short getPC();

  byte getSP();

  byte getA();

  byte getX();

  byte getY();

  boolean getCarryFlag();

  boolean getZeroFlag();

  boolean getInterruptDisable();

  boolean getDecimalMode();

  boolean getOverflowFlag();

  boolean getNegativeFlag();
  
}
