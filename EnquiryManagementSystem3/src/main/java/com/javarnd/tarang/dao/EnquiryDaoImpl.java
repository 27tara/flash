package com.javarnd.tarang.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javarnd.tarang.model.Enquiry;
import com.javarnd.tarang.repository.EnquiryRepository;

@Transactional
@Service
public class EnquiryDaoImpl implements EnquiryDao {
	
	@Autowired
	EnquiryRepository enquiryRepository;
	

	public List<Enquiry> getAllEnquiries(int id) {
		return enquiryRepository.findAll();
		
	}

	public Optional<Enquiry> getEnquiry(int id) {
		return enquiryRepository.findById(id);
	}

	public Enquiry addEnquiry(Enquiry enquiry) {
		return enquiryRepository.save(enquiry);
	}

	public void updateEnquiry(Enquiry enquiry) {
		enquiryRepository.save(enquiry);
		
	}

	public void deleteEnquiry(int id) {
		enquiryRepository.deleteById(id);
		
	}

	public List<Enquiry> getEnquiries() {
		
		return enquiryRepository.findAll();
	}

}
