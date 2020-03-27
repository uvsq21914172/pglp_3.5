package fr.uvsq21914172.pgpl35;

import static org.junit.Assert.*;
import org.junit.Test;
import fr.uvsq21914172.pgpl35.UneClasseMetier;

public class ClasseMetierTest {

  @Test
  public void testUneMethodeMetier() {
    UneClasseMetier m = new UneClasseMetier();
    m.uneMethodeMetier(System.out);
    assertTrue(true);
  }

}
