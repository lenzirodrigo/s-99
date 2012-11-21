package main.scala.ninetyNineScalaProblems
//Find the last element of a list.
class Lists {

	//P01 (*) Find the last element of a list.
	def last(x: List[Int]): Int = x match {
		case h :: Nil => h  
		case h :: t => last(t)
		case List() => throw new NoSuchElementException("Empty List")
	} 

  
	//P02 (*) Find the last but one element of a list.
	def penultimate(x: List[Int]): Int = x match {
		case h :: y :: Nil => h
		case h :: Nil => throw new Exception("One element List")
		case h :: t => penultimate(t)
		case List() => throw new NoSuchElementException("Empty List")
	} 
	
	//P03 (*) Find the Kth element of a list.
	def nth(n: Int, x: List[Int]): Int ={
	  if (n == 0) x.head
	  else nth(n-1,x.tail)
	} 
	

	
}