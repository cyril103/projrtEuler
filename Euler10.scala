object Euler10 extends App {
	import Euler7._

	val res = Stream.from(2).filter(x => isPrime(x.toLong)).takeWhile(x => x<= 2000000L).sum
	println(res)
}