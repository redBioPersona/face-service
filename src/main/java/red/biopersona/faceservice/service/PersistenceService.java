package red.biopersona.faceservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PersistenceService implements IPersistenceService{

	@Value("${persistence-service.enroll}")
	String enrollEndPoint;
	
	public void saveTemplate(String client,String biometricPerson,String segmentation,byte[] file) {
		
	}
}
