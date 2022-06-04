package red.biopersona.faceservice.service;

import org.springframework.web.multipart.MultipartFile;

import com.neurotec.biometrics.NSubject;
import com.neurotec.images.NImage;

import red.biopersona.faceservice.controller.exception.CollectionsServiceException;
import red.biopersona.faceservice.model.RequestEnrollFaceDTO;
import red.biopersona.faceservice.model.ResponseCaracteristicasDTO;
import red.biopersona.faceservice.model.ResponseEnrollFace;
import red.biopersona.faceservice.model.ResponseFaceQualityDTO;
import red.biopersona.faceservice.model.ResponsePuedeCrearTemplateDTO;

public interface IClientesService {
	
	ResponseCaracteristicasDTO getFaceFeatures(NSubject subject, boolean showFeatures);
	
	ResponseFaceQualityDTO geQuality(NSubject subject,int personsFound,NImage face,boolean getToken,boolean getTemplate);
	
	public ResponsePuedeCrearTemplateDTO puedeCrearTemplate(MultipartFile file) throws CollectionsServiceException;
	
	ResponseEnrollFace enrollFace(RequestEnrollFaceDTO request) throws CollectionsServiceException;
}
