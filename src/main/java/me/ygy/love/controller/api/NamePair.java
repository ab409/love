package me.ygy.love.controller.api;

import java.util.Objects;

/**
 * @author yuguangyuan
 */
public class NamePair {

  private final String man;
  private final String woman;

  public String getMan() {
    return man;
  }

  public String getWoman() {
    return woman;
  }

  public NamePair(String man, String woman) {
    this.man = man;
    this.woman = woman;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NamePair namePair = (NamePair) o;
    return Objects.equals(man, namePair.man) &&
            Objects.equals(woman, namePair.woman);
  }

  @Override
  public int hashCode() {
    return Objects.hash(man, woman);
  }
}
