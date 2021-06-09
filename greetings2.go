package main

import (
	"fmt"
	"strings"
)

func main() {
	var input string
	fmt.Scanf("%s", &input)
	fmt.Print("h")
	numbE := strings.Count(input, "e")

	for i := 0; i < 2*numbE; i++ {
		fmt.Print("e")
	}
	fmt.Print("y")
}
