package com.like.hrm.payitem.application.port.in.payitem.select;

import com.like.hrm.payitem.application.port.in.payitem.save.PayItemFormDTO;

public interface PayItemSelectUseCase {
	PayItemFormDTO select(String companyCode, String itemCode);
}
