/**
 * @param {number} x
 * @return {number}
 */
let reverse = (number) => {
  //   const MIN = Math.pow(-2, 31)
  //   const MAX = Number.MAX_SAFE_INTEGER
  const MAX = 2147483648
  const sign = number > 0 ? 1 : -1
  const result = parseInt(number.toString().split('').reverse().join(''))

  return result > MAX ? 0 : result * sign
}