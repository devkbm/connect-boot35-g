package com.like.hrm.payitem.application.port.in.paytable.select;

import com.like.hrm.payitem.application.port.in.paytable.save.PayTableSaveDTO;

public interface PayTableSelectUseCase {

	PayTableSaveDTO select(Long id);
}
