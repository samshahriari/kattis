package main

import "fmt"

func main() {
	var times int
	fmt.Scanf("%d", &times)
	for i := 0; i < times; i++ {
		var r int
		var e int
		var c int
		fmt.Scanf("%d%d%d", &r, &e, &c)
		rev := e - c - r
		if rev > 0 {
			fmt.Println("advertise")

		} else if rev == 0 {
			fmt.Println("does not matter")

		} else {

			fmt.Println("do not advertise")
		}

	}
}
