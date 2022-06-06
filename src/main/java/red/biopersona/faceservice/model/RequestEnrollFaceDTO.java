package red.biopersona.faceservice.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestEnrollFaceDTO implements Serializable {

	/** Variable para serializar la clase. */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "Client may not be null")
	@NotEmpty(message = "Client not empty")
	@NotBlank(message = "Client not black")
	private String client;

	private String segmentation;

	@NotNull(message = "biometricPerson may not be null")
	@NotEmpty(message = "biometricPerson not empty")
	private String biometricPerson;

	private boolean avoidDuplicates = true;

	@NotNull(message = "File may not be null")
	private MultipartFile file;

	@Override
	public String toString() {
		return "client(" + this.client + ", biometricPerson" + this.biometricPerson + ", segmentation" + segmentation
				+ ")";
	}

}