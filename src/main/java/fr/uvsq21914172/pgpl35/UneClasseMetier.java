package fr.uvsq21914172.pgpl35;

import java.io.PrintStream;
import java.time.LocalDateTime;

public class UneClasseMetier {
  public void uneMethodeMetier(PrintStream out) {
    out.println(LocalDateTime.now() + ": Début de uneMethodeMetier");
    out.println(LocalDateTime.now() + ": Fin de uneMethodeMetier");
  }
}
