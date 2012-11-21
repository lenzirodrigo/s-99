package ninetyNineScalaProblems
import ninetyNineScalaProblems._

object Test {
   val p = new Lists()                            //> p  : ninetyNineScalaProblems.Lists = ninetyNineScalaProblems.Lists@31f26605
	
	p.nth(9, List(1, 1, 3, 5, 8))             //> java.lang.UnsupportedOperationException: tail of empty list
                                                  //| 	at scala.collection.immutable.Nil$.tail(List.scala:404)
                                                  //| 	at scala.collection.immutable.Nil$.tail(List.scala:399)
                                                  //| 	at ninetyNineScalaProblems.Lists.nth(Lists.scala:24)
                                                  //| 	at ninetyNineScalaProblems.Lists.nth(Lists.scala:24)
                                                  //| 	at ninetyNineScalaProblems.Lists.nth(Lists.scala:24)
                                                  //| 	at ninetyNineScalaProblems.Lists.nth(Lists.scala:24)
                                                  //| 	at ninetyNineScalaProblems.Lists.nth(Lists.scala:24)
                                                  //| 	at ninetyNineScalaProblems.Lists.nth(Lists.scala:24)
                                                  //| 	at ninetyNineScalaProblems.Test$$anonfun$main$1.apply$mcV$sp(ninetyNineS
                                                  //| calaProblems.Test.scala:7)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at ninety
                                                  //| Output exceeds cutoff limit.
	

}