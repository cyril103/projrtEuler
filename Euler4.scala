object Euler4 extends App {
def isPalindrome(num:Int) = {
	val p = num.toString
	p == p.reverse
}

val palindromes = for{
	x <-(100 to 999)
	y <- (100 to 999)
if isPalindrome(x*y)
	} yield x*y

	println(palindromes.max)
}