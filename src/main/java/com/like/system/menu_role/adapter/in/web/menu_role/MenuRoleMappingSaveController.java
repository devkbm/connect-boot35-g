package com.like.system.menu_role.adapter.in.web.menu_role;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.like.core.message.MessageUtil;
import com.like.system.menu_role.application.dto.menu_role.MenuRoleMappingSaveDTO;
import com.like.system.menu_role.application.port.in.menu_role.MenuRoleMappingSaveUseCase;

import jakarta.validation.Valid;

@RestController
public class MenuRoleMappingSaveController {

	MenuRoleMappingSaveUseCase useCase;
	
	MenuRoleMappingSaveController(MenuRoleMappingSaveUseCase useCase) {
		this.useCase = useCase;
	}
	
	@PostMapping("/api/system/menurole")
	public ResponseEntity<?> saveMenu(@RequestBody @Valid List<MenuRoleMappingSaveDTO> dto) throws Exception {												
						
		useCase.save(dto);																			
														 				
		return toList(null, MessageUtil.getSaveMessage(1));
	}		
}
