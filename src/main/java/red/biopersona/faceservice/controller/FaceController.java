package red.biopersona.faceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import red.biopersona.faceservice.controller.exception.CollectionsServiceException;
import red.biopersona.faceservice.model.RequestEnrollFaceDTO;
import red.biopersona.faceservice.model.RequestValidaFaceDTO;
import red.biopersona.faceservice.model.ResponseEnrollFace;
import red.biopersona.faceservice.model.ResponseValidaFaceDTO;
import red.biopersona.faceservice.service.ClientesService;

@RestController
@RequestMapping("/face")
public class FaceController {
	@Autowired
	ClientesService clientesService;
		
	@ApiOperation(value = "Carga de archivo", notes = "En el header Location devuelve el recurso que fue registrado", response=ResponseEntity.class, httpMethod="POST")				    
	@PostMapping(value = "/enroll", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<?> enroll(@ModelAttribute RequestEnrollFaceDTO request) throws CollectionsServiceException  {
		HttpStatus code = HttpStatus.BAD_REQUEST;
		ResponseEnrollFace resul=clientesService.enrollFace(request);
		if(resul.getMessage().equals("OK")) {
			code=HttpStatus.OK;
		}
		return new ResponseEntity<>(resul, code);
	}
	
	@ApiOperation(value = "Carga de archivo", notes = "En el header Location devuelve el recurso que fue registrado", response=ResponseEntity.class, httpMethod="POST")				    
	@PostMapping(value = "/valida", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<?> valida(@ModelAttribute RequestValidaFaceDTO request) throws CollectionsServiceException  {
		HttpStatus code = HttpStatus.BAD_REQUEST;
		ResponseValidaFaceDTO resul=clientesService.validaFace(request);
		if(resul.getMessage().equals("OK")) {
			code=HttpStatus.OK;
		}
		return new ResponseEntity<>(resul, code);
	}
	
	
}
