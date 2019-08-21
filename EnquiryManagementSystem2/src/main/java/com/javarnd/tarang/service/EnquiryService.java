package com.javarnd.tarang.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.javarnd.tarang.model.Enquiry;

public interface EnquiryService {

	List<Enquiry> getEnquiries();

	void updateEnquiry(@Valid Enquiry enquiry);

	Optional<Enquiry> getEnquiry(int id);

	Enquiry addEnquiry(@Valid Enquiry enquiry);

	void deleteEnquiry(int id);

}
