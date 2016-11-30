object Euler2 extends App {
	def fib(x:Int, y:Int): Stream[Int]={
		x #:: fib(y, x+y)
	}

	val res = fib(1,2).takeWhile(n => n <=4000000).filter(_%2==0).sum
	println(res)
	
}