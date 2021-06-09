package main

import (
	"fmt"
)

func main() {
	var times int
	total := 0.0
	years := 0.0
	fmt.Scanf("%d", &times)
	fmt.Println(times, "time")
	for i := 0; i < times; i++ {
		var year float64
		var score float64
		fmt.Scanf("%f%f", &year, &score)
		years += year
		total += year * score
	}
	fmt.Printf("%.4f", total)
}
