package com.like.hrm.payitem.application.port.in.payexpression;

import lombok.Builder;

@Builder
public record PayExpressionSaveDTO(
		String clientAppUrl,
		String companyCode,
		String payItemCode,
		String payCondition,
		String formula,		
		Long seq,
		String comment
		) {
}
