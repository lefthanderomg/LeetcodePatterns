package solutions

class BestTimeToBuyAndSellStock {

    fun maxProfit(prices: IntArray): Int {
        var min = prices[0]
        var maxProfit = 0

        prices.forEach {
            if (min > it) {
                min = it
            }
            val currentMaxProfit = it - min
            if (currentMaxProfit > maxProfit) maxProfit = currentMaxProfit
        }

        return maxProfit
    }
}