package test.scala.ninetyNineScalaProblems
import main.scala.ninetyNineScalaProblems._


object TestWorksheet {
   val p = new Lists()                            //> p  : main.scala.ninetyNineScalaProblems.Lists = main.scala.ninetyNineScalaPr
                                                  //| oblems.Lists@2107ebe1
	
	p.nth(3, List(1, 1, 3, 5, 8))             //> res0: Int = 5
	p.last(List(1, 1, 3, 5, 8))               //> res1: Int = 8
}