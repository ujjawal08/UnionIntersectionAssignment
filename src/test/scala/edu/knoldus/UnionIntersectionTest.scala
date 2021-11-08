package edu.knoldus

import org.scalatest.funsuite.AnyFunSuite


class UnionIntersectionTest extends AnyFunSuite {
  val set1 = Set(1, 2, 3, 4, 5)
  val set2 = Set(11, 2, 3, 4, 5)
  val test: UnionIntersection = new UnionIntersection() {
    test("union of the two given sets") {
      assert(test.union(set1, set2) == Set(1, 2, 3, 4, 5, 11))
    }
    val set3 = Set(7, 8, 9, 4, 5)
    val set4 = Set(11, 5, 1, 4, 7)
    val test1: UnionIntersection = new UnionIntersection() {
      test("intersection of two given sets") {
        assert(test1.intersection(set3, set4) == Set(5, 7, 4))
      }
    }
  }
}