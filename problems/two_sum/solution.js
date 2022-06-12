/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

var twoSum = function (nums, target) {
  const lookup = new Map()
  for (let i = 0; i < nums.length; i++) {
    // current iterating value
    let current = nums[i]
    // complementary value of current iterating value
    let complementValue = target - current
    // if lookup map has the complementValue;
    // return the 2 indexes that adds up to target
    if (lookup.has(complementValue)) {
      return [i, lookup.get(complementValue)]
    }
    // sets current iterating value for tracking
    lookup.set(current, i)
  }
}