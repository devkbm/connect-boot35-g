package com.like.system.menu_role.adapter.in.web.menu;

import static com.like.core.web.util.ResponseEntityUtil.toList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.like.core.message.MessageUtil;
import com.like.system.menu_role.application.port.in.menu.delete.MenuGroupDeleteUseCase;

@RestController
public class MenuGroupDeleteController {
	
	private MenuGroupDeleteUseCase useCase;		
			
	public MenuGroupDeleteController(MenuGroupDeleteUseCase useCase) {
		this.useCase = useCase;		
	}			
		
	@DeleteMapping("/api/system/menugroup/{menuGroupCode}")
	public ResponseEntity<?> delCodeGroup(@RequestParam String companyCode, @PathVariable String menuGroupCode) {				
												
		useCase.delete(companyCode, menuGroupCode);							
		
		return toList(null, MessageUtil.getDeleteMessage(1));
	}	
	
}
