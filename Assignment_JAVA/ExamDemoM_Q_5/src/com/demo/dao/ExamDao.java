package com.demo.dao;

import java.time.LocalDate;

import com.demo.beans.Question;

public interface ExamDao {

	void javatest(int eid, String ename, String topic, LocalDate ldt, Question[] ques);



}
