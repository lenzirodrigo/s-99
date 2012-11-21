package test.scala.ninetyNineScalaProblems

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import main.scala.ninetyNineScalaProblems.Lists

@RunWith(classOf[JUnitRunner])
class ListTest extends FunSuite {
  trait TestLists {
    val p = new Lists() 
    
    val l1 = List(1, 2, 3, 4, 5)
    val l2 = List(1)
    val l3 = List()
  }
  
   test("Last Element") {
    new TestLists {
      assert(p.nth(2, l1) === 3)
    }
  }
   
   test("Penultimate Element"){
     new TestLists {
       assert(p.penultimate(l1) === 4)
     }
   }
   
   test("Nth Element"){
     new TestLists {
       assert(p.nth(3, l1) === 4)
     }
   }
  
  
}