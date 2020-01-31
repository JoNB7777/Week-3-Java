package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") --> "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		int inputLength = input.length();
		String ourResult = new String();
		for (int i = 0; i < inputLength; i++) {
			String newString = input.substring(i, i + 1) + input.substring(i, i + 1) + input.substring(i, i + 1);
			ourResult = ourResult + newString;
		}
	    return ourResult;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		return "";
	}
//		int bertCounter = 0;
//		int inputLength = input.length();
//		String returnString = "";
//		if (inputLength >= 8) {
//			String string = new String();
//			while (bertCounter == 0) {
//				for (int i = 0; i <= inputLength - 4; i++) {
//					if (input.substring(i, i + 4).equalsIgnoreCase("bert")) {
//						bertCounter += 1;
//						string = input.substring(i + 4, inputLength);
//					}
//				}
//			}
//			while (bertCounter == 1) {
//				int substringLength = string.length();
//				for (int j = substringLength; j >= 4; j--) {
//					if (string.substring(j, j).equalsIgnoreCase("bert")) {
//						bertCounter += 1;
//						string = string.substring(0, j - 4);
//						return string;
//					}
//				
//				}
//			}
//		}
//		if (bertCounter != 2) {
//			return "";
//		}
//	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		int largestInt = 0;
		int mediumInt = 0;
		int smallestInt = 0;
		if (a < b && a < c) {
			smallestInt = a;
			if (b < c) {
				mediumInt = b;
				largestInt = c;
			} else {
				mediumInt = c;
				largestInt = b;
			}
		} else if (a < b) {
			smallestInt = c;
			mediumInt = a;
			largestInt = b;
		} else if (a < c){
			smallestInt = b;
			mediumInt = a;
			largestInt = c;
		} else if (b < c) {
			largestInt = a;
			mediumInt = c;
			smallestInt = b;
		} else {
			largestInt = a;
			mediumInt = b;
			smallestInt = c;
		}
		if ((largestInt - mediumInt) == (mediumInt - smallestInt)) {
			return true;
		} else  {
			return false;
		}
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		int inputLength = input.length();
		int amountOfLettersToStay = inputLength - a;
		int lettersPerSide = amountOfLettersToStay / 2;
		String stringLeft = input.substring(0, lettersPerSide);
		String stringRight = input.substring(inputLength - lettersPerSide, inputLength);
		String resultString = stringLeft + stringRight;
		return resultString;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		int inputLength = input.length();
		if (inputLength >= 3) {
			String inputEndsIn = input.substring(inputLength -3, inputLength);
			if (inputEndsIn.equalsIgnoreCase("dev")) {
				return true;
			} else {
				return false;
			}
		}
		
		else return false;
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		int longestBlockLength = 1;
		int counter = 1;
		int inputLength = input.length();
		if (inputLength > 0) {
			for (int i = 1; i < inputLength; i++) {
				if (input.substring(i -1, i).equals(input.substring(i, i+ 1))) {
					counter += 1;
				} else {
					if (counter > longestBlockLength) {
						longestBlockLength = counter;
						counter = 1;
					} else {
						counter = 1;
					}
				}
			}
			if (longestBlockLength > 1) {
				return longestBlockLength;
			} else {
				return counter;
			}
			
		} else {
			return 0;
		}

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
//		int counter = 0;
//		int inputLength = arg1.length();
//		if (inputLength >= 4) {
//			for (int i = 2; i < inputLength - 1; i++) {
//				if (arg1.substring(i - 1, i).equalsIgnoreCase("a") && arg1.substring(i, i +1 ).equalsIgnoreCase("m")) {
//					if (i < inputLength) {
//						if (arg1.substring( i - 2, i + 2).equals(" ") && arg1.substring(i + 1).equals(" ")) {
//							counter += 1;
//						}
//					} else if (i == inputLength) {
//						if (arg1.substring(i-2, i - 1).equals(" ")) {
//							counter += 1;
//						}
//					}
//				}
//			}
//			if (arg1.substring(0, 1).equalsIgnoreCase("a") && arg1.substring(1, 2).equalsIgnoreCase("m") && arg1.substring(2, 3).equals(" ")) {
//				counter += 1;
//			}
//		} else if (inputLength == 3) {
//			if (arg1.substring(0, 1).equalsIgnoreCase("a") && arg1.substring(1, 2).equalsIgnoreCase("m") && arg1.substring(2, 3).equals(" ")) {
//				counter += 1;
//			} else if (arg1.substring(0, 1).equals(" ") && arg1.substring(1, 2).equalsIgnoreCase("a") && arg1.substring(2, 3).equalsIgnoreCase("m")) {
//				counter+= 1;
//			}
//		} else if (inputLength == 2) {
//			if (arg1.equalsIgnoreCase("am")) {
//				counter += 1;
//			}
//		}
//		return counter;
		int counter = 0;
		int inputLength = arg1.length();
		if (inputLength >= 3) {
			if (arg1.substring(0, 3).equalsIgnoreCase("am ")) {
				counter += 1;
			} else if (arg1.substring(inputLength - 3, inputLength).equalsIgnoreCase(" am")) {
				counter += 1;
				}
			}
		if (inputLength >= 4) {
			for (int i = 1; i < inputLength - 1; i ++) {
				if (arg1.substring(i - 1, i + 1) == " am ")  {
					counter += 1;
				}
			}
		}
		return counter;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		if ((arg1 % 3 == 0) && (arg1 % 5 == 0)) {
			return "fizzbuzz";
		} else if (arg1 % 3 == 0) {
			return "fizz";
		} else if (arg1 % 5 == 0) {
			return "buzz";
		}
		else return null;
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {
		int highestValue = 0;
		int counter = 0;
		int inputLength = arg1.length();
		for (int i = 0; i <= inputLength; i++) {
			if (i < inputLength) {
				if (arg1.substring(i, i + 1).equals(" ")) {
					if (counter > highestValue) {
						highestValue = counter;
						counter = 0;
					} else {
						counter = 0;
					}
				} else if (arg1.substring(i, i + 1).equals("1")) {
					counter += 1;
				} else if (arg1.substring(i, i + 1).equals("2")) {
					counter += 2;
				} else if (arg1.substring(i, i + 1).equals("3")) {
					counter += 3;
				} else if (arg1.substring(i, i + 1).equals("4")) {
					counter += 4;
				} else if (arg1.substring(i, i + 1).equals("5")) {
					counter += 5;
				} else if (arg1.substring(i, i + 1).equals("6")) {
					counter += 6;
				} else if (arg1.substring(i, i + 1).equals("7")) {
					counter += 7;
				} else if (arg1.substring(i, i + 1).equals("8")) {
					counter += 8;
				} else if (arg1.substring(i, i + 1).equals("9")) {
					counter += 9;
				}
			} else if (i == inputLength) {
				if (arg1.substring(i).equals(" ")) {
					if (counter > highestValue) {
						highestValue = counter;
						counter = 0;
					} else {
						counter = 0;
					}
				} else if (arg1.substring(i).equals("1")) {
					counter += 1;
				} else if (arg1.substring(i).equals("2")) {
					counter += 2;
				} else if (arg1.substring(i).equals("3")) {
					counter += 3;
				} else if (arg1.substring(i).equals("4")) {
					counter += 4;
				} else if (arg1.substring(i).equals("5")) {
					counter += 5;
				} else if (arg1.substring(i).equals("6")) {
					counter += 6;
				} else if (arg1.substring(i).equals("7")) {
					counter += 7;
				} else if (arg1.substring(i).equals("8")) {
					counter += 8;
				} else if (arg1.substring(i).equals("9")) {
					counter += 9;
				}
			}
		}
		if (highestValue == 0) {
			highestValue = counter;
		}
		if (counter > highestValue) {
			highestValue = counter;
		}
		return highestValue;
		
	}
	
	
}
