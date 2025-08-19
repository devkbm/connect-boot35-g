package com.like.system.company.application.port.in.query;

import com.like.system.company.domain.CompanyInfo;
import com.like.system.company.domain.CompanyInfoId;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-19T15:30:01+0900",
    comments = "version: 1.6.3, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.14.3.jar, environment: Java 21.0.6 (Eclipse Adoptium)"
)
@Component
public class CompanyQueryResultDTOMapstructImpl implements CompanyQueryResultDTOMapstruct {

    @Override
    public CompanyQueryResultDTO toDTO(CompanyInfo entity) {

        CompanyQueryResultDTO.CompanyQueryResultDTOBuilder companyQueryResultDTO = CompanyQueryResultDTO.builder();

        if ( entity != null ) {
            companyQueryResultDTO.companyCode( entityIdCompanyCode( entity ) );
            companyQueryResultDTO.companyName( entity.getCompanyName() );
            companyQueryResultDTO.businessRegistrationNumber( entity.getBusinessRegistrationNumber() );
            companyQueryResultDTO.coporationNumber( entity.getCoporationNumber() );
            companyQueryResultDTO.nameOfRepresentative( entity.getNameOfRepresentative() );
            companyQueryResultDTO.establishmentDate( entity.getEstablishmentDate() );
        }

        return companyQueryResultDTO.build();
    }

    private String entityIdCompanyCode(CompanyInfo companyInfo) {
        CompanyInfoId id = companyInfo.getId();
        if ( id == null ) {
            return null;
        }
        return id.getCompanyCode();
    }
}
