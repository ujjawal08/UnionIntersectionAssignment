package edu.knoldus

class UnionIntersection {
  // UNION OF THE TWO GIVEN SETS
  def union(set1:Set[Int],set2:Set[Int]):Set[Int] = {
    val result:Set[Int] =  set1.union(set2)
    result.foreach(x => println(x))
    result
  }
  //INTERSECTION OF THE TWO GIVEN SETS
  def intersection(set1:Set[Int],set2:Set[Int]):Set[Int] = {
    val result:Set[Int] =  set1.intersect(set2)
    result.foreach(x => println(x))
    result
  }
}
