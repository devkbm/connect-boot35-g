package com.like.system.user.export;

public interface SystemUserLoginDTOSelectUseCase {

	SystemUserLoginDTO get(String staffNo, String companyCode);
}
