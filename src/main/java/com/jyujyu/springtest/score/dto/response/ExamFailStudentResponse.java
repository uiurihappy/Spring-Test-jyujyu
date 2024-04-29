package com.jyujyu.springtest.score.dto.response;

public record ExamFailStudentResponse(
	String studentName,
	Double avgScore
) {
	public static ExamFailStudentResponse of(String studentName, Double avgScore) {
		return new ExamFailStudentResponse(studentName, avgScore);
	}
}