package red.biopersona.faceservice.service;

import red.biopersona.faceservice.controller.exception.CollectionsServiceException;

public interface IPersistenceService {
	public String saveTemplate(String client, String biometricPerson, String segmentation,byte[] file) throws CollectionsServiceException;
}
