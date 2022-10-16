package com.mav.MavenProject;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class AssertFalse {
  public boolean isEvenNumber(int number) {
       boolean result= false;
  if(number%2==0) {
            result= true;
}
       return result;
}
@Test
public void evenNumberTest() {
  AssertFalse asft= new AssertFalse();
  assertFalse(asft.isEvenNumber(7));
}
}