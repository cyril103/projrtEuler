object Euler9 extends App {

	 val res =for{
		a <- (1 to 200)
		b <- (2 to 400)
		c <- (3 to 500)
		if a*a + b*b == c*c && a < b && b < c && a+b+c == 1000

		}yield(a,b,c)
	println(res.toList)
}