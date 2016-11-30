object Euler6 extends App {

	def sum(a:Int,b:Int,f : Int =>Int): Int ={
		if(a>b) 0
		else f(a) + sum(a+1,b,f)
	}

	val sumdescarre = sum(1,100, n => n*n)
	val somme = (1 to 100).sum
	val carredelasomme = somme*somme
	val res = carredelasomme - sumdescarre

	println(res)
	
}