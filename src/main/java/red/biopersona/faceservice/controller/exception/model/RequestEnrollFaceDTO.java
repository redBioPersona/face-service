package red.biopersona.faceservice.controller.exception.model;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestEnrollFaceDTO implements Serializable {

    /** Variable para serializar la clase. */
    private static final long serialVersionUID = 1L;
    
    private String client;
    
    private String segmentation;
    
    private String biometricPerson;
    
    private boolean avoidDuplicates=true;
    
    private MultipartFile file;

}