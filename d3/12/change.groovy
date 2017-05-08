// Write a program that reads the total cost of a purchase and an amount of money
// that is paid to buy it. Your program should output the correct change specifying
// the amount of notes (50, 20, 10, 5) and coins (2, 1, 0.50, 0.20, 0.10, 0.05,
// 0.02, 0.01) needed.

println("Enter the total cost:")
String str = System.console().readLine()
float cost = Float.parseFloat(str)

println("Enter the amount paid:")
str = System.console().readLine()
float amount = Float.parseFloat(str)

float diff = amount - cost

if (diff < 0) {
	println("Amount too low")
	return
}

float[] coins = [50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01]

while (diff > 0) {
	for (i = 0; i < coins.size(); i++) {
		float coin = coins[i]
		if (diff >= coin) {
			println(coin)
			diff -= coin
			break
		}
	}
}
