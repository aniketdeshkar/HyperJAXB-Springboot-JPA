package com.ad.controller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ad.repository.GenericRepository;
import com.example.model.Document;

@RestController
public class HyperJaxBController {
	
	@Autowired
	private GenericRepository genericRepository;

	@GetMapping("runhyper")
	public String unmarshal() throws Exception {
		File file = new File("src/main/resources/pain.008.002.02.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Document.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Document root = (Document) unmarshaller.unmarshal(file);
        genericRepository.save(root);
        return "done";
	}
	
}
