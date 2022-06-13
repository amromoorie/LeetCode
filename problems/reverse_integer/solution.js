/**
 * @param {number} x
 * @return {number}
 */
let reverse = function (number) {
  const MIN = Math.pow(-2, 31)
  const MAX = Math.pow(2, 31)

  const sign = number > 0 ? 1 : -1
  const reversed = parseInt(number.toString().split('').reverse().join(''))

  if (reversed > MAX || reversed < MIN) return 0
  return reversed * sign
}