package ninetyNineScalaProblems
import ninetyNineScalaProblems._

object Test {
   val p = new Lists()                            //> p  : ninetyNineScalaProblems.Lists = ninetyNineScalaProblems.Lists@31f26605
	
	p.penultimate(List(1))                    //> java.lang.Exception: One element List
                                                  //| 	at ninetyNineScalaProblems.Lists.penultimate(Lists.scala:12)
                                                  //| 	at ninetyNineScalaProblems.Test$$anonfun$main$1.apply$mcV$sp(ninetyNineS
                                                  //| calaProblems.Test.scala:7)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at ninetyNineScalaProblems.Test$.main(ninetyNineScalaProblems.Test.scala
                                                  //| :4)
                                                  //| 	at ninetyNineScalaProblems.Test.main(ninetyNineScalaProblems.Test.scala)
                                                  //| 

}