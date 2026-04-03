package com.app.quantity_measurement_app.dto.dto_conversion;

import com.app.quantity_measurement_app.dto.dtoRequest.RegisterRequest;
import com.app.quantity_measurement_app.entity.User;

public class UserDTO {
	
	public User toUser(RegisterRequest registerRequest) {
		return new User(registerRequest.getUsername(), registerRequest.getEmail(), registerRequest.getPassword(), registerRequest.getRole());
	}
}
