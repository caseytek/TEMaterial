/*
 * Document this function
 */

 /**
 *
 *Take details of a day and return if it is summer.
 *
 * @param {number} month a number that reflects what month it is
 * @param {number} day a number that reflects what day it is
 * @param {string} hemisphere string that returns what hemisphere you are in 
 * @returns {boolean} returns if it is summer
 * 
 */

function isSummer(month, day = 1, hemisphere = 'northern') {
  if (month === 7 || month === 8) {
    return hemisphere === 'northern';
  } else if (month === 6 && day >= 20) {
    return hemisphere === 'northern';
  } else if (month === 9 && day <= 20) {
    return hemisphere === 'northern';
  } else if (month === 1 || month === 2) {
    return hemisphere === 'southern';
  } else if (month === 12 && day >= 20) {
    return hemisphere === 'southern';
  } else if (month === 3 && day <= 20) {
    return hemisphere === 'southern';
  } else {
    return false;
  }
}

/**
 * Write a function called isAdmitted. It will check entrance
 * scores and return true if the students is admitted and
 * false if rejected. It takes three parameters:
 *
 *     * gpa
 *     * satScore (optional)
 *     * recommendation (optional)
 *
 * We admit them--return true--if:
 * gpa is above 4.0 OR
 * SAT score is above 1300 OR
 * gpa above 3.0 and they have a recommendation OR
 * SAT score is above 1200 and they have a recommendation
 * OTHERWISE reject it
 *
 * @param {number} gpa the GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] the student's SAT score
 * @param {boolean} [recommendation=false] does the student have a recommendation
 * @returns {boolean} true if they are admitted
 */

 function isAdmitted(gpa, satScore = 0, recommendation = false){
   if(gpa > 4 ^ satScore > 1300){
     return true;
   } else if ((gpa > 3 && recommendation == true) ^ (satScore > 1200 && recommendation == true)){
     return true;
   } else {
     return false;
   }
 }

/**
 * Write a function called useParameterToFilterArray so that it takes an anonymous
 * function and uses that in `unfilteredArray` filter function. Return the result.
 *
 * @param {function} filterFunction the function to filter with
 * @returns {number[]} the filtered array
 */
let unfilteredArray = [1, 2, 3, 4, 5, 6];

function useParameterToFilterArray(filterFunction){
  return unfilteredArray.filter(filterFunction);
}
/**
 * Write a function called makeNumber to take two strings
 * of digits, concatenate them together, and then return
 * the value back as a number.
 *
 * So if two strings are passed in "42293" and "443", then this function
 * should return the number 42293443.
 *
 * @param {string} first the first string of digits to concatenate
 * @param {string} [second=''] the second string of digits to concatenate
 * @returns {number} the resultant number
 */

 function makeNumber(first, second=''){
   let newNum = first + second;
   return Number(newNum);
 }

/**
 * Write a function called addAll that takes an unknown number of parameters
 * and adds them all together. Return the result.
 *
 * @param {...number} num a series of numbers to add together
 * @returns {number} the sum of all the parameters (or arguments)
 */
function addAll(num){
  let result = 0;
  for(let i = 0; i < arguments.length; i++) {
      result += arguments[i];
  }
  return result;
}

/*
 * Write and document a function called makeHappy that takes
 * an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array. Use the `map` function.
 */
function makeHappy(array){
  return array.map( 
     (num) => { return num = num.replace(/^/,'Happy ');}
  );
}

/*
 * Write and document a function called getFullAddressesOfProperties
 * that takes an array of JavaScript objects containing the
 * following keys:
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 *
 * and returns an array of strings that turns the JavaScript objects
 * into mailing addresses in the form of:
 *     streetNumber streetName streetType city state zip
 * 
 *
 * Use `map` and an anonymous function.
 */

 /**
  *  * function getFullAddressesOfProperties
  * takes an array of JavaScript objects containing the
  * following keys:
  *     * streetNumber
  *     * streetName
  *     * streetType
  *     * city
  *     * state
  *     * zip
  *
  * and returns an array of strings that turns the JavaScript objects
  * into mailing addresses in the form of:
  *     streetNumber streetName streetType city state zip
  * 
  *  @param {object []} array a series of objects
  *  @return {String []} returns a string array of full addresses concatenated from the objects 
  */
function getFullAddressesOfProperties(array){
  let addresses = array.map( 
     (object) => { return [object.streetNumber, object.streetName, object.streetType, object.city, object.state, object.zip].join(" "); }
  );
    return addresses;
}


/*
 * Create and document a function called findLargest.
 *
 * Using `forEach`, find the largest element in an array.
 * It should work for strings and numbers.
 */
/**
 * function findLargest takes in an array and returns an the largest element in the array
 * 
 * @param {array []} array
 * @result {String}
 */

 function findLargest(array){
   let largest = "";
     array.forEach(function(item){ 
       if(item > largest){
         largest = item;
       }
      }); return largest;
    } 




/*
 * CHALLENGE
 * Create and document a function called getSumOfSubArrayValues.
 *
 * Take an array of arrays and add up all sub values and return
 * the sum. For instance, if you got this array as a parameter:
 * [
 *   [1, 2, 3],
 *   [2, 4, 6],
 *   [5, 10, 15]
 * ];
 *
 * You would return 48. To do this, you will use two nested `reduce`
 * calls with two anonymous functions.
 *
 * Read the tests to verify you have the correct behavior.
 */
