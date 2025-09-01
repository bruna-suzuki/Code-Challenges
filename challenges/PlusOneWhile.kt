package challenges

fun main() {
    val digits = intArrayOf(9,9,9,9)
    var i = digits.size - 1

    while (i >= 0) {
        if (digits[i] < 9) {
            digits[i] += 1
            println(digits.contentToString())
            return
        }
        digits[i] = 0
        i--
    }

    val result = IntArray(digits.size + 1)
    result[0] = 1
    println(result.contentToString())
    return

}