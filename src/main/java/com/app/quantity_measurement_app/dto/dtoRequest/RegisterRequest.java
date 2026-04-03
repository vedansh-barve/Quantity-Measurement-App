package com.app.quantity_measurement_app.dto.dtoRequest;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterRequest {

	@NotNull(message = "Username cannot be Null")
	String username;
	
	@NotNull(message = "Email cannot be Null")
	String email;
	
	@NotNull(message = "Password cannot be Null")
	String password;
	
	@NotNull(message = "Role cannot be Null")
	String role;
}
