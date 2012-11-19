package ninetyNineScalaProblems
//Find the last element of a list.
class Lists {
	def last(x: List[Int]): Int = x match {
		case h :: Nil => h  
		case h :: t => last(t)
		case List() => throw new NoSuchElementException("Empty List")
	} 
	
	def penultimate(x: List[Int]): Int = x match {
		case h :: y :: Nil => h
		case h :: Nil => throw new Exception("One element List")
		case h :: t => penultimate(t)
		case List() => throw new NoSuchElementException("Empty List")
	} 
	
}