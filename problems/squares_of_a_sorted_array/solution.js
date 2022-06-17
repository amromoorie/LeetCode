/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortedSquares = function (nums) {
  const n = nums.length
  const result = [].fill(n)

  let pos = n - 1
  let start = 0
  let end = n - 1

  while (end >= start) {
    let startValue = Math.pow(nums[start], 2)
    let endValue = Math.pow(nums[end], 2)

    if (endValue >= startValue) {
      result[pos] = endValue
      end--
    } else {
      result[pos] = startValue
      start++
    }
    pos--
  }
  return result
}