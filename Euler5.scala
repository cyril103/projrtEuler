object Euler5 extends App {

	def gcd(a:Int,b:Int) : Int = {
		if(b == 0) a
		else gcd(b, a%b)
	} 

	def lcm(a:Int,b:Int) : Int = {
		(a*b)/gcd(a,b)
	}

	val res = (1 to 20).foldLeft(1)((a,b) => lcm(a,b))

	println(res)
}