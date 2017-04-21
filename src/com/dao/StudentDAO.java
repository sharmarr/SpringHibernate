package com.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.bean.StudentPOJO;

public class StudentDAO {

	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Transactional(readOnly = false)
	public int store(StudentPOJO st) {

		template.save(st);
		return 1;

	}

}
