package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class EuclidTest {

  @Test
  void gcdInt() {
    assertAll(
        (Executable) () -> assertEquals(6791, Euclid.gcd(38593253, 53777929)),
        (Executable) () -> assertEquals(6791, Euclid.gcd(38593253, 53777929)),
        (Executable) () -> assertEquals(6791, Euclid.gcd(38593253, 53777929)));
  }


              @Test
              void gcdLong() {
      assertEquals(6791, Euclid.gcd(38593253, 53777929));
      assertEquals(6791, Euclid.gcd(53777929, 38593253));
    }
  }