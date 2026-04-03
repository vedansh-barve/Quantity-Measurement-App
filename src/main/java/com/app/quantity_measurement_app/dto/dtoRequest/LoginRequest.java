package com.app.quantity_measurement_app.dto.dtoRequest;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginRequest {

	@NotNull(message = "Email cannot not be Null")
	private String email;
	
	@NotNull(message = "Password cannot not be Null")
	private String password;
}
