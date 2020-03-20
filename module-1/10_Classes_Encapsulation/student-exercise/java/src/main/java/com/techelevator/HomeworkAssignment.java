package com.techelevator;

public class HomeworkAssignment {
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;

public HomeworkAssignment(int possibleMarks) {
	this.possibleMarks = possibleMarks;
}

public int getEarnedMarks() {
	return earnedMarks;
}

public void setEarnedMarks(int earnedMarks) {
	this.earnedMarks = earnedMarks;
}

public int getPossibleMarks() {
	return possibleMarks;
}

public String getSubmitterName() {
	return submitterName;
}

public void setSubmitterName(String submitterName) {
	this.submitterName = submitterName;
}

public String getLetterGrade() {
	int integerGrade = earnedMarks * 100/possibleMarks;
	if (integerGrade >= 90) {
		letterGrade = "A";
	} else if (integerGrade >= 80) {
		letterGrade = "B";
	} else if (integerGrade >= 70) {
		letterGrade = "C";
	} else if ( integerGrade >= 60) {
		letterGrade = "D";
	} else {
		letterGrade = "F";
	}
	return letterGrade;
	}

}

//letterGrade is a derived attribute that is calculated using earnedMarks 
	//and possibleMarks.
//For 90% or greater return "A"
//80-89% return "B"
//70-79% return "C"
//60-69% return "D"
//otherwise return "F"
//hint: possibleMarks and earnedMarks are integers. 
	//What happens when a smaller integer is divided by a larger integer?
