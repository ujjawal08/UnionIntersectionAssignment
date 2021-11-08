package edu.knoldus

object IntegerTree {
  abstract class IntTree

  case object EmptyTree extends IntTree

  case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

// CONTAIN FUNCTION FOR INTEGERTREE

  def contains(t: IntTree, v: Int): Boolean = t match {
    case EmptyTree => false
    case Node(e, l, r) =>
      if (v < e) contains(l, v)
      else if (v > e) contains(r, v)
      else true
  }

//INSERT FUNCTION FOR INTEGERTREE

  def insert(t: IntTree, v: Int): IntTree = t match {
    case EmptyTree => Node(v, EmptyTree, EmptyTree)
    case Node(e, l, r) =>
      if (v < e) Node(e, insert(l, v), r)
      else if (v > e) Node(e, l, insert(r, v))
      else t
  }


  def main(args: Array[String]): Unit = {
    val t = insert(insert(insert(insert(insert(EmptyTree, 11), 1), 20), 18), 25)
    println("The Tree is: " + t)
    println("Tree contain 20?: " + (if (contains(t, 20)) "Yes" else "No"))
    println("Tree contain 15?: " + (if (contains(t, 11)) "Yes" else "No"))
  }
  }