object Euler7 extends App {
	def isPrime(n:Int) = (2 until ((math.sqrt(n).toInt)+1)).forall( n % _ != 0)

	def isPrime(n:Long) = (2L until ((math.sqrt(n).toLong)+1L)).forall( n % _ != 0)
	
	val res = Iterator.from(2).filter(isPrime).drop(10000).take(1).toList

	println(res)


}