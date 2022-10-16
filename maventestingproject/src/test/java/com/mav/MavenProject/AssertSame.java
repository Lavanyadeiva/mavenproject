package com.mav.MavenProject;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class AssertSame {
     public String getPropValue(final String key) {
  Map<String, String> appProps = new HashMap<String, String>();
  appProps.put("key1", "value 1");
  appProps.put("key2", "value 3");
  appProps.put("key3", "value 3");
     return appProps.get(key);
}
@Test
public void test() {
    AssertSame msnt = new AssertSame();
      assertSame(msnt.getPropValue("key2"), msnt.getPropValue("key3"));
      assertNotSame(msnt.getPropValue("key1"), msnt.getPropValue("key3"));
}}