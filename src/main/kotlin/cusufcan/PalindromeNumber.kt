package cusufcan

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        return x.toString() == x.toString().reversed()
    }
}