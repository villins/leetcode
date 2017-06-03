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

func subarraySum2(nums []int, k int) int {
	result := 0
	sum := 0
	l := len(nums)
	nMap := make(map[int]int)
	nMap[0] = 1
	for i := 0; i < l; i++ {
		sum += nums[i]
		if v, ok := nMap[sum-k]; ok {
			result += v
		}

		if v, ok := nMap[sum]; ok {
			nMap[sum] = v + 1
		} else {
			nMap[sum] = 1
		}
	}
	return result
}

func main() {
	array := []int{1, 1, 1}
	fmt.Println(subarraySum(array, 2))
	fmt.Println(subarraySum2(array, 2))
}
