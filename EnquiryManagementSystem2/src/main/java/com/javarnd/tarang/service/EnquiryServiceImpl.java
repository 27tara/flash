package com.javarnd.tarang.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javarnd.tarang.dao.EnquiryDao;
import com.javarnd.tarang.model.Enquiry;

@Transactional
@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired
	EnquiryDao enquiryDao;
	@Override
	public List<Enquiry> getEnquiries() {
		return enquiryDao.getEnquiries();
	}
	@Override
	public void updateEnquiry(@Valid Enquiry enquiry) {
		enquiryDao.updateEnquiry(enquiry);
		
	}
	@Override
	public Optional<Enquiry> getEnquiry(int id) {
		return enquiryDao.getEnquiry(id);
	}

	@Override
	public Enquiry addEnquiry(@Valid Enquiry enquiry) {
		return enquiryDao.addEnquiry(enquiry);
	}

	@Override
	public void deleteEnquiry(int id) {
		enquiryDao.deleteEnquiry(id);
		
	}

}
