package main

import "fmt"

func subarraySum(nums []int, k int) int {
	result := 0
	l := len(nums)
	for i := 0; i < l; i++ {
		sum := 0
		for j := i; j < l; j++ {
			sum += nums[j]
			if sum == k {
				result = result + 1
			}
		}
	}
	return result
}

func main() {
	array := []int{1, 1, 1}
	fmt.Println(subarraySum(array, 2))
}
